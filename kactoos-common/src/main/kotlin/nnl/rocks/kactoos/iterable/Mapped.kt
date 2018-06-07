package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterator.Mapped

/**
 * Mapped iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @param fnc Func
 * @param src Source iterable
 * @since 0.4
 */
class Mapped<X : Any, Y : Any>(
    fnc: KFunc<X, Y>,
    src: Iterable<X>
) : IterableEnvelope<Y>({ Iterable { Mapped(fnc, src.iterator()) } }) {

    constructor(
        fnc: KFunc<X, Y>,
        vararg src: X
    ) : this(fnc, src.asIterable())

    constructor(
        fnc: KFunc<X, Y>,
        src: Iterator<X>
    ) : this(fnc, IterableOf(src))

    constructor(
        fnc: Func<X, Y>,
        src: Iterator<X>
    ) : this(
        { x -> fnc.apply(x) },
        src
    )

    constructor(
        fnc: Func<X, Y>,
        vararg src: X
    ) : this(
        { x -> fnc.apply(x) },
        src.asIterable()
    )

    constructor(
        fnc: Func<X, Y>,
        iterable: Iterable<X>
    ) : this(
        { x -> fnc.apply(x) },
        iterable
    )
}