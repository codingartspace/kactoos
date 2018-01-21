[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapNoNulls](.)

# MapNoNulls

`class MapNoNulls<K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<K, V>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapNoNulls.kt#L12)

A decorator of [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`K` - Type of key

`V` - Type of value

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapNoNulls(map: `[`MapEnvelope`](../-map-envelope/index.md)`<K, V>)``MapNoNulls(map: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<K, V>)`<br>A decorator of [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that tolerates no NULLs. |