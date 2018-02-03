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

package nnl.rocks.kactoos.bytes;

import nnl.rocks.kactoos.io.BytesOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.IOException;
import java.util.Base64;

/**
 * Test case for {@link BytesBase64}.
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: f62ddd0808e4100aef0f9c59047232e726759adb $
 * @since 0.20.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public final class BytesBase64Test {

    @Test
    public void checkEncodeBasic() throws IOException {
        MatcherAssert.assertThat(
            "Can't encodes bytes using the Base64 basic encoding scheme",
            new BytesBase64(
                new BytesOf(
                    "Hello!"
                )
            ).asBytes(),
            Matchers.equalTo(
                new BytesOf("SGVsbG8h").asBytes()
            )
        );
    }

    @Test
    public void checkEncodeUrl() throws IOException {
        MatcherAssert.assertThat(
            "Can't encodes bytes using the Base64 URL encoding scheme",
            new BytesBase64(
                new BytesOf(
                    "Hello!"
                ), Base64.getUrlEncoder()
            ).asBytes(),
            Matchers.equalTo(
                new BytesOf("SGVsbG8h").asBytes()
            )
        );
    }

    @Test
    public void checkEncodeMime() throws IOException {
        MatcherAssert.assertThat(
            "Can't encodes bytes using the Base64 mime encoding scheme",
            new BytesBase64(
                new BytesOf(
                    "Hello!"
                ), Base64.getMimeEncoder()
            ).asBytes(),
            Matchers.equalTo(
                new BytesOf("SGVsbG8h").asBytes()
            )
        );
    }

}
