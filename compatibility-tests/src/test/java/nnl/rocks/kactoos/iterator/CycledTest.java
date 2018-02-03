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
package nnl.rocks.kactoos.iterator;

import nnl.rocks.kactoos.iterable.IterableNoNulls;
import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.matchers.ScalarHasValue;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.Collections;
import java.util.NoSuchElementException;

/**
 * Test Case for {@link Cycled}.
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 27ade7f37b17f73e1150526e8a9f8714a3a9e3a9 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class CycledTest {

    @Test
    public void repeatIteratorTest() {
        final String expected = "two";
        MatcherAssert.assertThat(
            "Can't repeat iterator",
            new ItemAt<>(
                new Cycled<>(
                    new IterableNoNulls<>(
                        new IterableOf<>(
                            "one", expected, "three"
                        )
                    )
                ),
                // @checkstyle MagicNumberCheck (1 line)
                7
            ),
            new ScalarHasValue<>(
                expected
            )
        );
    }

    @Test(expected = NoSuchElementException.class)
    public void notCycledEmptyTest() {
        new Cycled<>(
            Collections::emptyIterator
        ).next();
    }
}
