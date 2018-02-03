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
package nnl.rocks.kactoos.time;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Locale;

/**
 * Tests for OffsetDateTimeAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: 18cf273b8d4f9e218ae6f6c82d71c6a7d6f6d595 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public final class OffsetDateTimeAsTextTest {

    @Test
    public void offsetDateTimeFormattedAsIsoDateTime() {
        final OffsetDateTime date = OffsetDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        );
        MatcherAssert.assertThat(
            "Can't format a OffsetDateTime with default/ISO format.",
            new OffsetDateTimeAsText(date).asString(),
            Matchers.is("2017-12-13T14:15:16.000000017+01:00")
        );
    }

    @Test
    public void offsetDateTimeFormattedWithFormatString() {
        final OffsetDateTime date = OffsetDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        );
        MatcherAssert.assertThat(
            "Can't format a OffsetDateTime with format.",
            new OffsetDateTimeAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
            Matchers.is("2017-12-13 14:15:16")
        );
    }

    @Test
    public void offsetDateTimeFormattedWithFormatStringWithLocale() {
        final OffsetDateTime date = OffsetDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        );
        MatcherAssert.assertThat(
            "Can't format a OffsetDateTime with format using locale.",
            new OffsetDateTimeAsText(
                date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
            ).asString(),
            Matchers.is("2017 déc. 13. 14.15.16")
        );
    }

    @Test
    public void currentOffsetDateTimeAsText() {
        MatcherAssert.assertThat(
            "Can't format a OffsetDateTime with ISO format.",
            new OffsetDateTimeAsText(OffsetDateTime.now()).asString(),
            Matchers.notNullValue()
        );
    }

}
