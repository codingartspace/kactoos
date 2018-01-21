package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.io.IOException

/**
 * Text implementing Comparable.
 *
 * Below the example how you can sort words in a string:
 *
 * ```
 * Iterable<Text> sorted = new Sorted<>(
 *   new Mapped<>(
 *     ComparableText::new,
 *     new SplitText("The quick brown fox jumps over the lazy dog", " ")
 *   )
 * )
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.27
 */
class ComparableText(private val text: Text) : Text, Comparable<Text> {

    override fun compareTo(other: Text): Int = UncheckedScalar(
        ScalarOf { this.text.asString().compareTo(other.asString()) }
    ).value()

    @Throws(IOException::class)
    override fun asString(): String = this.text.asString()
}