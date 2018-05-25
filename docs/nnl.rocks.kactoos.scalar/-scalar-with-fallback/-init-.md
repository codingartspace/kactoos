[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ScalarWithFallback](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ScalarWithFallback(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, fallbacks: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`FallbackFrom`](../-fallback-from/index.md)`<`[`T`](index.md#T)`>>, follow: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`>)`

Scalar with a fallback plan.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`origin` - Original scalar

`fallbacks` - Fallbacks

`follow` - Follow up function

**Since**
0.5
