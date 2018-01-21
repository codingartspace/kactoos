[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Shuffled](.)

# Shuffled

`class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/Shuffled.kt#L24)

Shuffled list.

Pay attention that shuffling will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire list from the encapsulated object and sort it. If you
want to avoid that "side-effect", decorate it with
[StickyList](../-sticky-list/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**See Also**

[StickyList](../-sticky-list/index.md)

**Since**
0.23

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Shuffled(vararg src: T)`<br>`Shuffled(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)`<br>`Shuffled(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)``Shuffled(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<T>)`<br>Shuffled list. |