[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.test](../index.md) / [FuncApplies](.)

# FuncApplies

`class FuncApplies<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/test/FuncApplies.kt#L23)

Matcher for the value.

### Parameters

`input` - Input of the function.

`matcher` - Matcher of the result.

`X` - Type of input

`Y` - Type of output

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FuncApplies(input: X, result: Y)``FuncApplies(input: X, matcher: Matcher<Y>)`<br>Matcher for the value. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |