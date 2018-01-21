[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [AndFunc](.)

# AndFunc

`class AndFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndFunc.kt#L36)

Logical conjunction.

This class can be effectively used to iterate through
a collection, just like [java.util.stream.Stream.forEach](#) works:

```
new And(
  new IterableOf("Mary", "John", "William", "Napkin"),
  name -> System.out.printf("The name: %s\n", name)
).value();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

There is no thread-safety guarantee.

### Parameters

`iterable` - The iterable

`X` - Type argument

**See Also**

[UncheckedScalar](../-unchecked-scalar/index.md)

[IoCheckedScalar](../-io-checked-scalar/index.md)

**Since**
0.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, vararg src: X)`<br>`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: X)`<br>`AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`<br>`AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`<br>`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`<br>`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)``AndFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>Logical conjunction. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert it to the value. |