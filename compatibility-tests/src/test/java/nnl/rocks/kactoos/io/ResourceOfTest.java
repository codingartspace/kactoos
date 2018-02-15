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

import java.io.IOException;
import java.util.Arrays;
import nnl.rocks.kactoos.text.FormattedText;
import nnl.rocks.kactoos.text.TextOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link ResourceOf}.
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: 15eefd07632c29b0097cc1a6721c6dd07aa61d67 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class ResourceOfTest {

    @Test
    public void readsBinaryResource() throws Exception {
        MatcherAssert.assertThat(
            "Can't read bytes from a classpath resource",
            Arrays.copyOfRange(
                new BytesOf(
                    new ResourceOf(
                        "nnl/rocks/kactoos/io/ResourceOfTest.class"
                    )
                ).asBytes(),
                // @checkstyle MagicNumber (2 lines)
                0,
                4
            ),
            Matchers.equalTo(
                new byte[]{
                    // @checkstyle MagicNumber (1 line)
                    (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE,
                    }
            )
        );
    }

    @Test
    public void readsTextResource() throws Exception {
        MatcherAssert.assertThat(
            "Can't read a text resource from classpath",
            new TextOf(
                new ResourceOf(
                    "org/cactoos/large-text.txt"
                )
            ).asString(),
            Matchers.endsWith("est laborum.\n")
        );
    }

    @Test
    public void readAbsentResourceTest() throws Exception {
        MatcherAssert.assertThat(
            "Can't replace an absent resource with a text",
            new TextOf(
                new BytesOf(
                    new ResourceOf(
                        "foo/this-resource-is-definitely-absent.txt",
                        "the replacement"
                    )
                )
            ).asString(),
            Matchers.endsWith("replacement")
        );
    }

    @Test(expected = IOException.class)
    public void throwsWhenResourceIsAbsent() throws Exception {
        new TextOf(
            new ResourceOf(
                "bar/this-resource-is-definitely-absent.txt"
            )
        ).asString();
    }

    @Test
    public void acceptsTextAsResourceName() throws Exception {
        MatcherAssert.assertThat(
            new TextOf(
                new ResourceOf(
                    new TextOf("org/cactoos/small-text.txt")
                )
            ).asString(),
            Matchers.endsWith("ex ea commodo")
        );
    }

    @Test
    public void acceptsTextsAsResourceNameAndFallback() throws Exception {
        MatcherAssert.assertThat(
            "Can't use Texts as parameters",
            new TextOf(
                new ResourceOf(
                    new FormattedText("%s/absent.txt", "baz"),
                    new TextOf("another replacement")
                )
            ).asString(),
            Matchers.startsWith("another")
        );
    }

}
