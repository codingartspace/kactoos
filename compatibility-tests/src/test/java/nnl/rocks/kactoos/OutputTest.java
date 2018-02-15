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
package nnl.rocks.kactoos;

import java.io.IOException;
import nnl.rocks.kactoos.io.DeadOutput;
import org.junit.Test;

/**
 * Test case for {@link Output.NoNulls}.
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 1850373be6972c0825ca06ba698437754fcd7374 $
 * @since 0.10
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class OutputTest {

    @Test(expected = IllegalArgumentException.class)
    public void failForNullOutput() throws IOException {
        new Output.NoNulls(null).stream();
    }

    @Test(expected = IOException.class)
    public void failForNullStream() throws IOException {
        new Output.NoNulls(() -> null).stream();
    }

    @Test
    public void okForNoNullOutput() throws IOException {
        new Output.NoNulls(new DeadOutput()).stream();
    }
}
