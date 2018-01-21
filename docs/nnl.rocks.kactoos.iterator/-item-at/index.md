[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [ItemAt](.)

# ItemAt

`class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/ItemAt.kt#L22)

Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)
or fallback value if iterator hasn't this position.

There is no thread-safety guarantee.

### Parameters

`T` - Scalar type

**Since**
0.7

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ItemAt(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>, fallback: T)`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>, T>)`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)``ItemAt(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>, T>)`<br>Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) or fallback value if iterator hasn't this position. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): T`<br>Convert it to the value. |