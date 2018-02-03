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

import nnl.rocks.kactoos.matchers.TextHasString;
import nnl.rocks.kactoos.text.HexOf;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.io.IOException;

/**
 * Test case for {@link Sha1DigestOf}.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: e06a5a9b29d291d1ba0a06f7ecbc3e79d2f4e796 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class Sha1DigestOfTest {

    @Test
    public void checksumOfEmptyString() {
        MatcherAssert.assertThat(
            "Can't calculate the empty string's SHA-1 checksum",
            new HexOf(
                new Sha1DigestOf(
                    new InputOf("")
                )
            ),
            new TextHasString(
                "da39a3ee5e6b4b0d3255bfef95601890afd80709"
            )
        );
    }

    @Test
    public void checksumOfString() {
        MatcherAssert.assertThat(
            "Can't calculate the string's SHA-1 checksum",
            new HexOf(
                new Sha1DigestOf(
                    new InputOf("Hello World!")
                )
            ),
            new TextHasString(
                "2ef7bde608ce5404e97d5f042f95f89f1c232871"
            )
        );
    }

    @Test
    public void checksumFromFile() throws IOException {
        MatcherAssert.assertThat(
            "Can't calculate the file's SHA-1 checksum",
            new HexOf(
                new Sha1DigestOf(
                    new InputOf(
                        new ResourceOf(
                            "org/cactoos/io/DigestEnvelope.class"
                        ).stream()
                    )
                )
            ),
            new TextHasString(
                "9d47e35afdcbf845aa9f05f15b4d936b97e55f0e"
            )
        );
    }

}
