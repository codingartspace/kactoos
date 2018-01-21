[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [RetryScalar](.)

# RetryScalar

`class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/RetryScalar.kt#L23)

Func that will try a few times before throwing an exception.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

### Parameters

`T` - Type of output

`origin` - Func original

`func` - Exit condition, returns TRUE if there is no reason to try

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RetryScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RetryScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>)``RetryScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func that will try a few times before throwing an exception. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): T`<br>Convert it to the value. |