[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.scalar](.)

## Package nnl.rocks.kactoos.scalar

Scalars.

### Types

| Name | Summary |
|---|---|
| [And](-and/index.md) | `class And : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndFunc](-and-func/index.md) | `class AndFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndInThreads](-and-in-threads/index.md) | `class AndInThreads : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndInThreadsFunc](-and-in-threads-func/index.md) | `class AndInThreadsFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndWithIndex](-and-with-index/index.md) | `class AndWithIndex : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [AndWithIndexFunc](-and-with-index-func/index.md) | `class AndWithIndexFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [AvgOf](-avg-of/index.md) | `class AvgOf : `[`NumberEnvelope`](-number-envelope/index.md)<br>Average of numbers. |
| [BoolOf](-bool-of/index.md) | `class BoolOf : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |
| [Equals](-equals/index.md) | `class Equals<in T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Equals. |
| [False](-false/index.md) | `class False : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical false. |
| [IoCheckedScalar](-io-checked-scalar/index.md) | `class IoCheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |
| [MaxOf](-max-of/index.md) | `class MaxOf : `[`NumberEnvelope`](-number-envelope/index.md)<br>Find the greater among items. |
| [MinOf](-min-of/index.md) | `class MinOf : `[`NumberEnvelope`](-number-envelope/index.md)<br>Find the smaller among items. |
| [Not](-not/index.md) | `class Not : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical negative. |
| [NumberEnvelope](-number-envelope/index.md) | `open class NumberEnvelope : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |
| [NumberOf](-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](-number-envelope/index.md)`, `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |
| [Or](-or/index.md) | `class Or : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [OrFunc](-or-func/index.md) | `class OrFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [Reduced](-reduced/index.md) | `class Reduced<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<X>`<br>Iterable, which elements are "reduced" through the func. |
| [RetryScalar](-retry-scalar/index.md) | `class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Func that will try a few times before throwing an exception. |
| [ScalarOf](-scalar-of/index.md) | `class ScalarOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Creates scalar out of [T](#) |
| [SolidScalar](-solid-scalar/index.md) | `class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Cached and synchronized version of a Scalar. |
| [StickyScalar](-sticky-scalar/index.md) | `class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Cached version of a Scalar. |
| [SumOf](-sum-of/index.md) | `class SumOf : `[`NumberEnvelope`](-number-envelope/index.md)<br>Int total of numbers. |
| [SyncScalar](-sync-scalar/index.md) | `class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Scalar that is thread-safe. |
| [Ternary](-ternary/index.md) | `class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Ternary operation. |
| [True](-true/index.md) | `class True : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical truth. |
| [UncheckedScalar](-unchecked-scalar/index.md) | `class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<T>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |