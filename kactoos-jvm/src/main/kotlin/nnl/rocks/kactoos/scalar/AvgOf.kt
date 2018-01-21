package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Average of numbers.
 *
 * Here is how you can use it to fine mathematical average of numbers:
 *
 * ```java
 * int sum = new AvgOf(1, 2, 3, 4).intValue();
 * long sum = new AvgOf(1L, 2L, 3L).longValue();
 * int sum = new AvgOf(numbers.toArray(new Integer[numbers.size()])).intValue();
 * ```
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 * @since 0.24
 */
class AvgOf : NumberEnvelope {

    /**
     * @param src Numbers
     */
    constructor(vararg src: Int) : super(
        ScalarOf {
            var sum = 0.0
            var total = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
                total += 1.0
            }
            if (total == 0.0) {
                total = 1.0
            }
            sum / total
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Long) : super(
        ScalarOf {
            var sum = 0.0
            var total = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
                total += 1.0
            }
            if (total == 0.0) {
                total = 1.0
            }
            sum / total
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Double) : super(
        ScalarOf {
            var sum = 0.0
            var total = 0.0
            for (`val` in src) {
                sum += `val`
                total += 1.0
            }
            if (total == 0.0) {
                total = 1.0
            }
            sum / total
        }
    )

    /**
     * @param src Numbers
     */
    constructor(vararg src: Float) : super(
        ScalarOf {
            var sum = 0.0
            var total = 0.0
            for (`val` in src) {
                sum += `val`.toDouble()
                total += 1.0
            }
            if (total == 0.0) {
                total = 1.0
            }
            sum / total
        }
    )

    /**
     * @param src Numbers
     */
    @SafeVarargs
    constructor(vararg src: Scalar<Number>) : this(IterableOf<Scalar<Number>>(src.iterator()))

    /**
     * @param src The iterable
     */
    constructor(src: Iterable<Scalar<Number>>) : super(
        ScalarOf {
            val numbers = src.iterator()
            var sum = 0.0
            var total = 0.0
            while (numbers.hasNext()) {
                val next = numbers.next().value()
                sum += next.toDouble()
                total += 1.0
            }
            if (total == 0.0) {
                total = 1.0
            }
            sum / total
        }
    )
}