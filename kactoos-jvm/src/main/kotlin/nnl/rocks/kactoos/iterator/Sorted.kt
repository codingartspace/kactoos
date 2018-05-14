package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.Comparator
import java.util.LinkedList

/**
 * Sorted iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.3
 */
class Sorted<T : Comparable<T>>(
    private val scalar: Scalar<Iterator<T>>
) : Iterator<T> by scalar() {

    constructor(
        comparator: Comparator<T>,
        iterator: Iterator<T>
    ) : this(
        StickyScalar<Iterator<T>>(
            Constant {
                val items = LinkedList<T>()
                while (iterator.hasNext()) {
                    items.add(iterator.next())
                }
                items.sortWith(comparator)
                items.iterator()
            }
        )
    )

    constructor(items: Iterator<T>) : this(Comparator.naturalOrder<T>(), items)

}
