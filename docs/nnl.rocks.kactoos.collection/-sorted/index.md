[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Sorted](.)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/Sorted.kt#L22)

Sorted collection.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire collection from the encapsulated object and sort it. If you
want to avoid that "side-effect", decorate it with
[StickyCollection](../-sticky-collection/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.19

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: Comparator<T>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<T>)`<br>`Sorted(vararg src: T)`<br>`Sorted(cmp: Comparator<T>, vararg src: T)`<br>`Sorted(cmp: Comparator<T>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)`<br>`Sorted(cmp: Comparator<T>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)``Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime. |