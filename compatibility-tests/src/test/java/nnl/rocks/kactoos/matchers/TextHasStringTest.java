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
package nnl.rocks.kactoos.matchers;

import nnl.rocks.kactoos.io.InputOf;
import nnl.rocks.kactoos.io.Md5DigestOf;
import nnl.rocks.kactoos.text.HexOf;
import org.hamcrest.Description;
import org.hamcrest.MatcherAssert;
import org.hamcrest.StringDescription;
import org.hamcrest.core.StringContains;
import org.junit.Test;

/**
 * Test case for {@link TextHasString}.
 *
 * @author Nikita Salomatin (nsalomatin@hotmail.com)
 * @version $Id: 86a888fb9c9f2ad44b8213f7bbb9b0a6a51182e0 $
 * @checkstyle JavadocMethodCheck (500 lines)
 * @since 0.29
 */
public final class TextHasStringTest {

    @Test
    public void hasClearDescriptionForFailedTest() {
        final HexOf hex = new HexOf(
            new Md5DigestOf(
                new InputOf("Hello World!")
            )
        );
        final Description description = new StringDescription();
        final TextHasString matcher = new TextHasString(
            "ed076287532e86365e841e92bfc50d8c6"
        );
        matcher.matchesSafely(hex);
        matcher.describeMismatchSafely(hex, description);
        MatcherAssert.assertThat(
            "Description is not clear ",
            description.toString(),
            new StringContains(
                "Text with \"ed076287532e86365e841e92bfc50d8c\""
            )
        );
    }
}
