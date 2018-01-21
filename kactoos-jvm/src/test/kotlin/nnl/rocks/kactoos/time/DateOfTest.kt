package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.Date

/**
 * Tests for DateOf.
 *
 *
 * @since 1.0
 *
 *
 */
class DateOfTest {

    @Test
    fun testParsingIsoFormattedStringToDate() {
        MatcherAssert.assertThat(
            "Can't parse a Date with default/ISO format.",
            DateOf("2017-12-13T14:15:16.000000017Z").value(),
            Matchers.`is`(
                Date.from(
                    LocalDateTime.of(
                        2017, 12, 13, 14, 15, 16, 17
                    ).toInstant(ZoneOffset.UTC)
                )
            )
        )
    }

    @Test
    fun testParsingCustomFormattedStringToDate() {
        MatcherAssert.assertThat(
            "Can't parse a Date with custom format.",
            DateOf(
                "2017-12-13 14:15:16.000000017",
                "yyyy-MM-dd HH:mm:ss.n"
            ).value(),
            Matchers.`is`(
                Date.from(
                    LocalDateTime.of(
                        2017, 12, 13, 14, 15, 16, 17
                    ).toInstant(ZoneOffset.UTC)
                )
            )
        )
    }

    @Test
    fun testParsingCustomFormatterStringToDate() {
        MatcherAssert.assertThat(
            "Can't parse a Date with custom format.",
            DateOf(
                "2017-12-13 14:15:16.000000017",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n")
            ).value(),
            Matchers.`is`(
                Date.from(
                    LocalDateTime.of(
                        2017, 12, 13, 14, 15, 16, 17
                    ).toInstant(ZoneOffset.UTC)
                )
            )
        )
    }
}