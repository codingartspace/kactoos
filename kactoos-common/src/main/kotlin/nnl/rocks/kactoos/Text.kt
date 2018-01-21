package nnl.rocks.kactoos

/**
 * Text.
 *
 * @since 0.2
 */
expect interface Text : Comparable<Text> {

    /**
     * Convert it to the string.
     *
     * @return The string.
     */
    fun asString(): String
}