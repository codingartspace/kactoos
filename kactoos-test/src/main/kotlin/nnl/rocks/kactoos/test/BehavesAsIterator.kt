package nnl.rocks.kactoos.test

import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BehavesAsIterator<T : Any>(
    private val origin: Iterator<T>,
    private val expected: Array<T>
) {

    init {
        for (value in expected) {
            assertTrue("Expected to have next element in iterator") { origin.hasNext() }
            assertEquals(value, origin.next(), "Expected value mismatch")
        }
        assertFalse(origin.hasNext(), "Expected end of iterator")
        assertFailsWith(
            NoSuchElementException::class,
            "Iterator does not throws NoSuchElementException on end"
        ) {
            origin.next()
        }
    }
}