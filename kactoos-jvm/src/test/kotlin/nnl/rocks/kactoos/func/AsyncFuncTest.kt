package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.FuncApplies
import nnl.rocks.kactoos.matchers.MatcherOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

/**
 * Test case for [AsyncFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: f4292d1cb8e804b42c6fa22b93334809f566fa3a $
 * @since 0.10
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class AsyncFuncTest {

    @Test
    fun runsInBackground() {
        MatcherAssert.assertThat(
            "Can't run in the background",
            AsyncFunc<Any, Any>(
                FuncOf { input ->
                    TimeUnit.DAYS.sleep(1L)
                    "done!"
                }
            ),
            FuncApplies(
                true,
                MatcherOf { future -> ! future.isDone }
            )
        )
    }

    @Test
    fun runsAsProcInBackground() {
        MatcherAssert.assertThat(
            "Can't run proc in the background",
            FuncOf { input: Boolean ->
                val latch = CountDownLatch(1)
                AsyncFunc<Boolean, Any>(
                    FuncOf { ipt -> latch.countDown() }
                ).exec(input)
                latch.await()
                true
            },
            FuncApplies(
                true, Matchers.equalTo(true)
            )
        )
    }

    @Test
    fun runsInBackgroundWithoutFuture() {
        val latch = CountDownLatch(1)
        MatcherAssert.assertThat(
            "Can't run in the background without us touching the Future",
            AsyncFunc(FuncOf { input -> latch.countDown(); "" }),
            FuncApplies(
                true,
                MatcherOf<Future<String>>(FuncOf { future -> latch.await(1L, TimeUnit.SECONDS) })
            )
        )
    }
}
