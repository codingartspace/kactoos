[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SolidFunc](.)

# SolidFunc

`class SolidFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SolidFunc.kt#L14)

Func that is thread-safe and sticky.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SolidFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)``SolidFunc(func: `[`SyncFunc`](../-sync-func/index.md)`<X, Y>)`<br>Func that is thread-safe and sticky. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |