package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.util.NoSuchElementException

/**
 * Repeat an element.
 *
 * If you need to repeat endlessly, use [Endless].
 *
 *
 *
 *
 * @param T Element type
 * @since 0.4
 */
class Repeated<T : Any>(
    private var repeat: Int,
    private val elm: UncheckedScalar<T>
) : Iterator<T> {

    /**
     * @param max How many times to repeat
     * @param element Element to repeat
     */
    constructor(
        max: Int,
        element: T
    ) : this(max, ScalarOf { element })

    /**
     * Ctor.
     * @param max How many times to repeat
     * @param scalar Scalar to repeat
     */
    constructor(
        max: Int,
        scalar: Scalar<T>
    ) : this(max, UncheckedScalar<T>(scalar))

    override fun hasNext(): Boolean = this.repeat > 0

    override fun next(): T {
        if (! this.hasNext()) {
            throw NoSuchElementException(
                "The iterator can't repeat anymore."
            )
        }
        -- this.repeat
        return this.elm.value()
    }
}