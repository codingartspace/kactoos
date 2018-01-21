package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.Arrays
import java.util.Collections
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyList].
 *
 *
 *
 * @since 0.8
 *
 *
 */
class StickyListTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            StickyList(1, 0, - 1, - 1, 2),
            BehavesAsList(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInIterable() {
        val size = AtomicInteger(2)
        val list = StickyList(
            ListOf<Int>(
                Collections.nCopies(size.incrementAndGet(), 0).iterator()
            )
        )
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying iterable",
            list.size,
            Matchers.equalTo<Int>(list.size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun decoratesArray() {
        MatcherAssert.assertThat(
            "Can't decorate an array of numbers",
            StickyList(- 1, 0).size,
            Matchers.equalTo(2)
        )
    }

    @Test
    fun testEmpty() {
        MatcherAssert.assertThat(
            StickyList<Any>().isEmpty(),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun testContains() {
        MatcherAssert.assertThat(
            StickyList(1, 2).contains(1),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun testToArray() {
        MatcherAssert.assertThat(
            StickyList(1, 2).toTypedArray(),
            Matchers.arrayContaining<Any>(1, 2)
        )
    }

    @Test
    fun testToArrayIntoArray() {
        MatcherAssert.assertThat(
            StickyList(1, 2).toTypedArray(),
            Matchers.arrayContaining(1, 2)
        )
    }

    @Test
    fun testContainsAll() {
        MatcherAssert.assertThat(
            StickyList(1, 2).containsAll(Arrays.asList(1, 2)),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun testIndexOf() {
        MatcherAssert.assertThat(
            StickyList(1, 2).indexOf(1),
            Matchers.equalTo(0)
        )
    }

    @Test
    fun testLastIndexOf() {
        MatcherAssert.assertThat(
            StickyList(1, 2, 2).lastIndexOf(2),
            Matchers.equalTo(2)
        )
    }

    @Test
    fun testGet() {
        MatcherAssert.assertThat(
            StickyList(1, 2)[1],
            Matchers.equalTo(2)
        )
    }

    @Test
    fun testSubList() {
        val list = StickyList(
            1, 2, 0, - 1
        ).subList(0, 2)
        MatcherAssert.assertThat(
            list.size,
            Matchers.equalTo(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = StickyList(
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

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val list = StickyList(
            Mapped(
                FuncOf<Int, Int> { i -> i },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat(
            "Can't map only once",
            list[0], Matchers.equalTo(list[0])
        )
    }
}