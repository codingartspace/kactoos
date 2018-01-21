[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [MaxOf](.)

# MaxOf

`class MaxOf : `[`NumberEnvelope`](../-number-envelope/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/MaxOf.kt#L35)

Find the greater among items.

Here is how you can use it to summarize numbers:

```
int sum = new MaxOf(1, 2, 3, 4).intValue();
long sum = new MaxOf(1L, 2L, 3L).longValue();
int sum = new MaxOf(numbers.toArray(new Integer[numbers.size()])).intValue();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

There is no thread-safety guarantee.

**See Also**

[UncheckedScalar](../-unchecked-scalar/index.md)

[IoCheckedScalar](../-io-checked-scalar/index.md)

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MaxOf(vararg src: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`MaxOf(vararg src: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`<br>`MaxOf(vararg src: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)`<br>`MaxOf(vararg src: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`)`<br>`MaxOf(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [toByte](../-number-envelope/to-byte.md) | `open fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](../-number-envelope/to-char.md) | `open fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toDouble](../-number-envelope/to-double.md) | `open fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [toFloat](../-number-envelope/to-float.md) | `open fun toFloat(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toInt](../-number-envelope/to-int.md) | `open fun toInt(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLong](../-number-envelope/to-long.md) | `open fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toShort](../-number-envelope/to-short.md) | `open fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [value](../-number-envelope/value.md) | `open fun value(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Convert it to the value. |