[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [CheckedScalar](./index.md)

# CheckedScalar

`class CheckedScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Scalar that wraps an original checked exception thrown by the origin using the given wrapping function.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result.

`E` - Type of exception.

`origin` - Original scalar.

`func` - Function that wraps exception.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Scalar that wraps an original checked exception thrown by the origin using the given wrapping function. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |