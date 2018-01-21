[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [LSInputOf](.)

# LSInputOf

`class LSInputOf : LSInput` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/LSInputOf.kt#L24)

Input as LSInput.

There is no thread-safety guarantee.

**Since**
0.6

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LSInputOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)``LSInputOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, pid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, sid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, base: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Input as LSInput. |

### Functions

| Name | Summary |
|---|---|
| [getBaseURI](get-base-u-r-i.md) | `fun getBaseURI(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getByteStream](get-byte-stream.md) | `fun getByteStream(): InputStream` |
| [getCertifiedText](get-certified-text.md) | `fun getCertifiedText(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [getCharacterStream](get-character-stream.md) | `fun getCharacterStream(): Reader` |
| [getEncoding](get-encoding.md) | `fun getEncoding(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getPublicId](get-public-id.md) | `fun getPublicId(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStringData](get-string-data.md) | `fun getStringData(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getSystemId](get-system-id.md) | `fun getSystemId(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [setBaseURI](set-base-u-r-i.md) | `fun setBaseURI(uri: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setByteStream](set-byte-stream.md) | `fun setByteStream(stream: InputStream): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setCertifiedText](set-certified-text.md) | `fun setCertifiedText(text: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setCharacterStream](set-character-stream.md) | `fun setCharacterStream(stream: Reader): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setEncoding](set-encoding.md) | `fun setEncoding(encoding: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setPublicId](set-public-id.md) | `fun setPublicId(pubid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setStringData](set-string-data.md) | `fun setStringData(data: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [setSystemId](set-system-id.md) | `fun setSystemId(sysid: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |