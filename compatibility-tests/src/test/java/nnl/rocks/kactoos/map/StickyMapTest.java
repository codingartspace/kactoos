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
package nnl.rocks.kactoos.map;

import nnl.rocks.kactoos.iterable.IterableOf;
import nnl.rocks.kactoos.iterator.Repeated;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Test case for {@link StickyMap}.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 22b673cf4f3b1b11d8dffe0b1ff1607e5af609da $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
public final class StickyMapTest {

    @Test
    public void behavesAsMap() {
        MatcherAssert.assertThat(
            "Can't behave as a map",
            new StickyMap<Integer, Integer>(
                new MapEntry<>(0, -1),
                new MapEntry<>(1, 1)
            ),
            new BehavesAsMap<>(0, 1)
        );
    }

    @Test
    public void ignoresChangesInMap() {
        final AtomicInteger size = new AtomicInteger(2);
        final Map<Integer, Integer> map = new StickyMap<>(
            new MapOf<>(
                () -> new Repeated<>(
                    size.incrementAndGet(), () -> new MapEntry<>(
                    new SecureRandom().nextInt(),
                    1
                )
                )
            )
        );
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying map",
            map.size(),
            Matchers.equalTo(map.size())
        );
    }

    @Test
    public void decoratesEntries() {
        MatcherAssert.assertThat(
            "Can't decorate a list of entries",
            new StickyMap<String, String>(
                new MapEntry<>("first", "Jeffrey"),
                new MapEntry<>("last", "Lebowski")
            ),
            Matchers.hasValue(Matchers.endsWith("ski"))
        );
    }

    @Test
    public void extendsExistingMap() {
        MatcherAssert.assertThat(
            "Can't extend an existing map",
            new StickyMap<String, String>(
                new StickyMap<String, String>(
                    new MapEntry<>("make", "Mercedes-Benz"),
                    new MapEntry<>("cost", "$95,000")
                ),
                new MapEntry<>("year", "2017"),
                new MapEntry<>("mileage", "12,000")
            ),
            Matchers.hasValue(Matchers.endsWith(",000"))
        );
    }

    @Test
    public void extendsExistingMapWithFunc() {
        MatcherAssert.assertThat(
            "Can't transform and decorate a list of entries",
            StickyMap.Companion.invoke(
                color -> new MapEntry<>(
                    color, color.toUpperCase(Locale.ENGLISH)
                ),
                new StickyMap<String, String>(
                    new MapEntry<>("black", "BLACK"),
                    new MapEntry<>("white", "WHITE")
                ),
                new IterableOf<>("yellow", "red", "blue")
            ),
            Matchers.hasValue(Matchers.equalTo("BLUE"))
        );
    }

    @Test
    public void extendsExistingMapWithTwoFuncs() {
        MatcherAssert.assertThat(
            "Can't transform and decorate a list of entries with two funcs",
            StickyMap.Companion.invoke(
                color -> String.format("[%s]", color),
                String::toUpperCase,
                new StickyMap<String, String>(
                    new MapEntry<>("black!", "Black!"),
                    new MapEntry<>("white!", "White!")
                ),
                new IterableOf<>("yellow!", "red!", "blue!")
            ),
            Matchers.hasValue(Matchers.equalTo("BLUE!"))
        );
    }

}
