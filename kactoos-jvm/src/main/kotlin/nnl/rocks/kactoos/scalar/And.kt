package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Logical conjunction.
 *
 * This class can be effectively used to iterate through
 * a collection, just like [java.util.stream.Stream.forEach] works:
 *
 * ```
 * new And(
 *   new IterableOf("Mary", "John", "William", "Napkin"),
 *   name -> System.out.printf("The name: %s\n", name)
 * ).value();
 * ```
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 * @param iterable The encapsulated iterable
 * @see UncheckedScalar
 * @see IoCheckedScalar
 * @since 0.8
 */
class And(private val iterable: Iterable<Scalar<Boolean>>) : Scalar<Boolean> {

    /**
     * @param src The iterable
     */
    @SafeVarargs
    constructor(vararg src: Scalar<Boolean>) : this(IterableOf(src.iterator()))

    /**
     * @param src The iterable
     * @since 0.24
     */
    constructor(src: Iterator<Scalar<Boolean>>) : this(IterableOf(src))

    @Throws(Exception::class)
    override fun value(): Boolean {
        var result = true
        for (item in this.iterable) {
            if (! item.value()) {
                result = false
                break
            }
        }
        return result
    }

    companion object {

        @SafeVarargs
        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            vararg src: X
        ): And {
            return And(
                AndFunc(func, src.iterator())
            )
        }

        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterator<X>
        ): And {
            return And(
                AndFunc(func, src)
            )
        }

        operator fun <X : Any> invoke(
            func: Func<X, Boolean>,
            src: Iterable<X>
        ): And {
            return And(
                AndFunc(func, src)
            )
        }

        @SafeVarargs
        operator fun <X : Any> invoke(
            proc: Proc<X>,
            vararg src: X
        ): And {
            return And(
                AndFunc(proc, src.iterator())
            )
        }

        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterator<X>
        ): And {
            return And(
                AndFunc(proc, src)
            )
        }

        operator fun <X : Any> invoke(
            proc: Proc<X>,
            src: Iterable<X>
        ): And {
            return And(
                AndFunc(proc, src)
            )
        }
    }
}