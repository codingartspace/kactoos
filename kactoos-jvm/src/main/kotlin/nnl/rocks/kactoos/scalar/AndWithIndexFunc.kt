package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.*
import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Logical conjunction, with index.
 *
 * This class can be effectively used to iterate through a collection,
 * just like [java.util.stream.Stream.forEach] works,
 * but with an index provided for each item:
 *
 * ```
 * new And(
 *   new IterableOf("Mary", "John", "William", "Napkin"),
 *   new BiFuncOf<>(
 *     (text, index) -> System.out.printf("Name #%d: %s\n", index, text),
 *     true
 *   )
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
 * @param iterable The iterable.
 * @param X Generic type.
 * @since 0.20
 */
class AndWithIndexFunc<X : Any>(
    private val iterable: Iterable<Func<Int, Boolean>>
) : Scalar<Boolean> {

    /**
     * @param proc Proc to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    @Suppress("SpreadOperator")
    constructor(
        proc: Proc<X>,
        vararg src: X
    ) : this(BiFuncOf<X, Int, Boolean>(proc, true), *src)

    /**
     * @param func Func to map
     * @param src The iterable
     * @param X Type of items in the iterable
     */
    @SafeVarargs
    constructor(
        func: BiFunc<X, Int, Boolean>,
        vararg src: X
    ) : this(func, IterableOf<X>(src.iterator()))

    /**
     * @param src The iterable
     * @param proc Proc to use
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        proc: BiProc<X, Int>,
        src: Iterable<X>
    ) : this(BiFuncOf<X, Int, Boolean>(proc, true), src)

    /**
     * @param src The iterable
     * @param func Func to map
     * @param X Type of items in the iterable
     * @since 0.24
     */
    constructor(
        func: BiFunc<X, Int, Boolean>,
        src: Iterable<X>
    ) : this(
        Mapped<X, Func<Int, Boolean>>(
            FuncOf { item -> FuncOf { input -> func.apply(item, input) } }, src
        )
    )

    @Throws(Exception::class)
    override fun invoke(): Boolean {
        return AndWithIndex(iterable).invoke()
    }

    internal fun iterable(): Iterable<Func<Int, Boolean>> = this.iterable
}
