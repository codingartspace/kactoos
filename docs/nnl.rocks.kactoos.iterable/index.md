[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.iterable](.)

## Package nnl.rocks.kactoos.iterable

Iterables.

### Types

| Name | Summary |
|---|---|
| [Cycled](-cycled/index.md) | `class Cycled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Cycled Iterable. |
| [Endless](-endless/index.md) | `class Endless<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Endless iterable. |
| [Filtered](-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>Filtered iterable. |
| [ItemAt](-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Element from position in [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) or fallback value if iterable hasn't this position. |
| [IterableEnvelope](-iterable-envelope/index.md) | `open class IterableEnvelope<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>`<br>Iterable envelope. |
| [IterableNoNulls](-iterable-no-nulls/index.md) | `class IterableNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)`<X>`<br>A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL. |
| [IterableOf](-iterable-of/index.md) | `class IterableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>Array as iterable. |
| [Joined](-joined/index.md) | `class Joined<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>A few Iterables joined together. |
| [LengthOf](-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.md)<br>Length of iterable. |
| [Limited](-limited/index.md) | `class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Limited iterable. |
| [Mapped](-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<Y>`<br>Mapped iterable. |
| [Partitioned](-partitioned/index.md) | `class Partitioned<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>>`<br>Iterable implementation for partitioning functionality. |
| [PropertiesOf](-properties-of/index.md) | `class PropertiesOf : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<Properties>`<br>Map as [java.util.Properties](#). |
| [RangeOf](-range-of/index.md) | `class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Iterable implementation to model range functionality. |
| [Repeated](-repeated/index.md) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Repeat an element. |
| [Reversed](-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>Reverse iterator. |
| [Shuffled](-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Shuffled iterable. |
| [Skipped](-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Skipped iterable. |
| [SolidIterable](-solid-iterable/index.md) | `class SolidIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>An [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<T>`<br>Sorted iterable. |
| [StickyIterable](-sticky-iterable/index.md) | `class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>Iterable that returns the same set of elements, always. |
| [SyncIterable](-sync-iterable/index.md) | `class SyncIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.md)`<X>`<br>Synchronized iterable. |