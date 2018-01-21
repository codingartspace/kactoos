[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListNoNulls](.)

# ListNoNulls

`class ListNoNulls<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/ListNoNulls.kt#L11)

A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListNoNulls(lst: `[`ListEnvelope`](../-list-envelope/index.md)`<T>)``ListNoNulls(list: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<T>)`<br>A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs. |