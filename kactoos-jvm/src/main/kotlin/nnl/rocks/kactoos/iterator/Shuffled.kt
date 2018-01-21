package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.util.Collections
import java.util.LinkedList

/**
 * Shuffled iterator.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.20
 */
class Shuffled<out T>(iterator: Iterator<T>) : Iterator<T> {

    private val scalar: UncheckedScalar<Iterator<T>>

    init {
        this.scalar = UncheckedScalar(
            StickyScalar<Iterator<T>>(
                ScalarOf {
                    val items = LinkedList<T>()
                    while (iterator.hasNext()) {
                        items.add(iterator.next())
                    }
                    Collections.shuffle(items)
                    items.iterator()
                }
            )
        )
    }

    override fun hasNext(): Boolean = this.scalar.value().hasNext()

    override fun next(): T = this.scalar.value().next()
}