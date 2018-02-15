/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2017-2018 Yegor Bugayenko
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nnl.rocks.kactoos.func;

import java.io.IOException;
import nnl.rocks.kactoos.Proc;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link IoCheckedProc}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: bc2f73be1d63f34c6c8e84b93eab74429334cf91 $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class IoCheckedProcTest {
    @Test
    public void rethrowsIoException() {
        final IOException exception = new IOException("intended");
        try {
            new IoCheckedProc<>(
                (Proc<Integer>) i -> {
                    throw exception;
                }
            ).exec(1);
        } catch (final IOException ex) {
            MatcherAssert.assertThat(
                ex, Matchers.is(exception)
            );
        }
    }

    @Test(expected = IOException.class)
    public void rethrowsCheckedToIoException() throws Exception {
        new IoCheckedProc<>(
            i -> {
                throw new Exception("intended to fail");
            }
        ).exec(1);
    }

    @Test(expected = IllegalStateException.class)
    public void runtimeExceptionGoesOut() throws IOException {
        new IoCheckedProc<>(
            i -> {
                throw new IllegalStateException("intended to fail here");
            }
        ).exec(1);
    }

}
