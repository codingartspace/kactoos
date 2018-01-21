[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [StickyScalar](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`StickyScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>)``StickyScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, T>)`

Cached version of a Scalar.

This [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncScalar](../-sync-scalar/index.md).

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md)

**Since**
0.3
