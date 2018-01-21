[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [JoinedText](.)

# JoinedText

`class JoinedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/JoinedText.kt#L22)

Join a Text.

### Parameters

`delimiter` - Delimit among texts

`texts` -

Texts to be joined




There is no thread-safety guarantee.




**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, vararg strs: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strs: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>`JoinedText(delimit: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, vararg txts: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>Ctor.`JoinedText(delimiter: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, texts: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>)`<br>Join a Text. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |