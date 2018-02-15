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

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Tests for LocalDateAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: a0b8ed01fc8fd38a1230e4eb22519de3b89940a1 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public final class LocalDateAsTextTest {

    @Test
    public void localDateFormattedAsIsoDateTime() {
        final LocalDate date = LocalDate.of(2017, 12, 13);
        MatcherAssert.assertThat(
            "Can't format a LocalDate with default/ISO format.",
            new LocalDateAsText(date).asString(),
            Matchers.is(
                MessageFormat.format(
                    "2017-12-13T00:00:00{0}",
                    date.atTime(LocalTime.MIN).atZone(ZoneId.systemDefault())
                        .getOffset().toString()
                )
            )
        );
    }

    @Test
    public void localDateFormattedWithFormatString() {
        final LocalDate date = LocalDate.of(2017, 12, 13);
        MatcherAssert.assertThat(
            "Can't format a LocalDate with format.",
            new LocalDateAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
            Matchers.is("2017-12-13 00:00:00")
        );
    }

    @Test
    public void localDateFormattedWithFormatStringWithLocale() {
        final LocalDate date = LocalDate.of(2017, 12, 13);
        MatcherAssert.assertThat(
            "Can't format a LocalDate with format using locale.",
            new LocalDateAsText(
                date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
            ).asString(),
            Matchers.is("2017 déc. 13. 00.00.00")
        );
    }

    @Test
    public void currentLocalDateAsText() {
        MatcherAssert.assertThat(
            "Can't format a LocalDate with ISO format.",
            new LocalDateAsText(LocalDate.now()).asString(),
            Matchers.notNullValue()
        );
    }

}
