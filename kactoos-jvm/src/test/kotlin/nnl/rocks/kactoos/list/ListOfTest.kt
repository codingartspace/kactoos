package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Ignore
import org.junit.Test
import java.util.Collections
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [ListOf].
 *
 *
 *
 * @since 0.1
 *
 *
 */
class ListOfTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            ListOf(1, 2),
            BehavesAsList(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun elementAtIndexTest() {
        val num = 345
        MatcherAssert.assertThat(
            "Can't convert an iterable to a list",
            ListOf(- 1, num, 0, 1)[1],
            Matchers.equalTo(num)
        )
    }

    @Test
    @Throws(Exception::class)
    fun sizeTest() {
        val size = 42
        MatcherAssert.assertThat(
            "Can't build a list with a certain size",
            ListOf(
                Collections.nCopies(size, 0)
            ),
            Matchers.hasSize(size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyTest() {
        MatcherAssert.assertThat(
            "Can't convert an empty iterable to an empty list",
            ListOf(
                emptyList()
            ).size,
            Matchers.equalTo(0)
        )
    }

    @Test(expected = IndexOutOfBoundsException::class)
    @Throws(Exception::class)
    fun lowBoundTest() {
        ListOf(Collections.nCopies(10, 0))[- 1]
    }

    @Test(expected = IndexOutOfBoundsException::class)
    @Throws(Exception::class)
    fun highBoundTest() {
        ListOf(Collections.nCopies(10, 0))[11]
    }

    @Test
    @Throws(Exception::class)
    @Ignore
    fun sensesChangesInIterable() {
        val size = AtomicInteger(2)
        val list = ListOf(
            Collections.nCopies(size.incrementAndGet(), 0)
        )
        MatcherAssert.assertThat(
            "Can't sense the changes in the underlying iterable",
            list.size,
            Matchers.not(Matchers.equalTo<Int>(list.size))
        )
    }

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = ListOf(
            Mapped(
                FuncOf<Int, Int> { i -> i + 1 },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat<List<Int>>(
            "Can't turn a mapped iterable into a list",
            list, Matchers.iterableWithSize(4)
        )
        MatcherAssert.assertThat<List<Int>>(
            "Can't turn a mapped iterable into a list, again",
            list, Matchers.iterableWithSize(4)
        )
    }
}