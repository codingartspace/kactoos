package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [MinOf].
 *
 *
 *
 * @since 0.10
 *
 *
 */
class MinOfTest {

    @Test
    fun withIntegerCollection() {
        MatcherAssert.assertThat(
            MinOf(
                1, 2, 3, 4
            ).toInt(),
            Matchers.equalTo(1)
        )
        MatcherAssert.assertThat(
            MinOf(
                1, 2, 3, 4
            ).toLong(),
            Matchers.equalTo(1L)
        )
        MatcherAssert.assertThat(
            MinOf(
                1, 2, 3, 4
            ).toDouble(),
            Matchers.equalTo(1.0)
        )
        MatcherAssert.assertThat(
            MinOf(
                1, 2, 3, 4
            ).toFloat(),
            Matchers.equalTo(1.0f)
        )
    }

    @Test
    fun withLongCollection() {
        MatcherAssert.assertThat(
            MinOf(
                1L, 2L, 3L, 4L
            ).toInt(),
            Matchers.equalTo(1)
        )
        MatcherAssert.assertThat(
            MinOf(
                1L, 2L, 3L, 4L
            ).toLong(),
            Matchers.equalTo(1L)
        )
        MatcherAssert.assertThat(
            MinOf(
                1L, 2L, 3L, 4L
            ).toDouble(),
            Matchers.equalTo(1.0)
        )
        MatcherAssert.assertThat(
            MinOf(
                1L, 2L, 3L, 4L
            ).toFloat(),
            Matchers.equalTo(1.0f)
        )
    }

    @Test
    fun withDoubleCollection() {
        MatcherAssert.assertThat(
            MinOf(
                1.0, 2.0, 3.0, 4.0
            ).toInt(),
            Matchers.equalTo(1)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0, 2.0, 3.0, 4.0
            ).toLong(),
            Matchers.equalTo(1L)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0, 2.0, 3.0, 4.0
            ).toDouble(),
            Matchers.equalTo(1.0)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0, 2.0, 3.0, 4.0
            ).toFloat(),
            Matchers.equalTo(1.0f)
        )
    }

    @Test
    fun withFloatCollection() {
        MatcherAssert.assertThat(
            MinOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toInt(),
            Matchers.equalTo(1)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toLong(),
            Matchers.equalTo(1L)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toDouble(),
            Matchers.equalTo(1.0)
        )
        MatcherAssert.assertThat(
            MinOf(
                1.0f, 2.0f, 3.0f, 4.0f
            ).toFloat(),
            Matchers.equalTo(1.0f)
        )
    }
}