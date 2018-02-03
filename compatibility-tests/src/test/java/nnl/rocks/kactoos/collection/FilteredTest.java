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
package nnl.rocks.kactoos.collection;

import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.iterable.LengthOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;

/**
 * Test case for {@link Filtered}.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 050e003f314baa136e1cb18ff072130dc97cd035 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
public final class FilteredTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            new Filtered<Integer>(i -> i < 2, 1, 2, 0, -1),
            new BehavesAsCollection<>(-1)
        );
    }

    @Test
    public void filterList() {
        MatcherAssert.assertThat(
            new LengthOf(
                new Filtered<String>(
                    input -> input.length() > 4,
                    new IterableOf<>("hello", "world", "друг")
                )
            ).intValue(),
            Matchers.equalTo(2)
        );
    }

    @Test
    public void filterEmptyList() {
        MatcherAssert.assertThat(
            new Filtered<String>(
                input -> input.length() > 4,
                Collections.emptyList()
            ),
            Matchers.emptyIterable()
        );
    }

    @Test
    public void size() {
        MatcherAssert.assertThat(
            new Filtered<String>(
                input -> input.length() >= 4,
                new IterableOf<>("some", "text", "yes")
            ).size(),
            Matchers.equalTo(2)
        );
    }

    @Test
    public void withItemsNotEmpty() {
        MatcherAssert.assertThat(
            new Filtered<String>(
                input -> input.length() > 4,
                new IterableOf<>("first", "second")
            ).isEmpty(),
            Matchers.equalTo(false)
        );
    }

    @Test
    public void withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
            new Filtered<String>(
                input -> input.length() > 16,
                new IterableOf<>("third", "fourth")
            ).isEmpty(),
            Matchers.equalTo(true)
        );
    }
}
