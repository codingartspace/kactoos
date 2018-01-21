package nnl.rocks.kactoos

/**
 * Function that accepts two arguments.
 *
 * If you don't want to have any checked exceptions being thrown
 * out of your [BiFunc], you can use
 * [nnl.rocks.kactoos.func.UncheckedBiFunc] decorator. Also
 * you may try [nnl.rocks.kactoos.func.IoCheckedBiFunc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @since 0.9
 */
@FunctionalInterface
interface BiFunc<in X : Any, in Y : Any, out Z : Any> {

    /**
     * Apply it.
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @throws Exception If fails
     */
    @Throws(Exception::class)
    fun apply(
        first: X,
        second: Y
    ): Z
}

internal typealias KBiFunc<X, Y, Z> = (X, Y) -> Z