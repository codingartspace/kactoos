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
package nnl.rocks.kactoos.io;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test case for {@link LengthOf}.
 *
 * @author Nikita Salomatin (nsalomatin@hotmail.com)
 * @version $Id: f022091d811ac54073139bcc4ac4f9d62fe8ee76 $
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 line)
 * @since 0.12
 */
public final class LengthOfTest {

    @Test
    public void lengthOfInputWithIntegerValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of input with integer value",
            new LengthOf(
                new InputOf("Hello1")
            ).intValue(),
            Matchers.equalTo(6)
        );
    }

    @Test
    public void lengthOfInputWithDoubleValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of input with double value",
            new LengthOf(
                new InputOf("Hello2")
            ).doubleValue(),
            Matchers.equalTo(6.0)
        );
    }

    @Test
    public void lengthOfInputWithFloatValue() {
        MatcherAssert.assertThat(
            "Can't calculate length of input with float value",
            new LengthOf(
                new InputOf("Hello3")
            ).floatValue(),
            Matchers.equalTo(6.0f)
        );
    }

    @Test
    public void lengthOfInputWithCustomBuffer() {
        MatcherAssert.assertThat(
            "Can't calculate length with custom buffer",
            new LengthOf(
                new InputOf("test buffer1"),
                1
            ).intValue(),
            Matchers.equalTo(12)
        );
    }

    // @checkstyle RegexpMultilineCheck (5 lines)

    /**
     * @todo #547:30m/DEV Fix calculation of length for zero buffer
     * I suppose to have an exception in that case
     * For now it runs forever
     */
    @Test
    @Ignore
    public void lengthOfZeroBuffer() {
        MatcherAssert.assertThat(
            "Can't calculate length with buffer of 0",
            new LengthOf(
                new InputOf("test buffer2"),
                0
            ).intValue(),
            Matchers.equalTo(12)
        );
    }

}
