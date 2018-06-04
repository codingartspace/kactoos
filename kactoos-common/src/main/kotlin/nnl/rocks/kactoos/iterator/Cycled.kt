package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * Cycled Iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.3
 */
class Cycled<out T : Any>(private val origin: () -> Iterator<T>) : Iterator<T> {

    constructor(origin: Iterable<T>) : this({ origin.iterator() })

    private var iterator: Iterator<T>? = null

    override fun hasNext(): Boolean {
        if (this.iterator == null || this.iterator !!.isEmpty()) {
            this.iterator = origin()
        }
        return this.iterator !!.hasNext()
    }

    override fun next(): T {
        if (isEmpty()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return this.iterator !!.next()
    }
}