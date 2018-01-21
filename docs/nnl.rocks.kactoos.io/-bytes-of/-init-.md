[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [BytesOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`BytesOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`

### Parameters

`bytes` - The input`BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

### Parameters

`input` - The input`BytesOf(file: File)`

### Parameters

`file` - The input

**Since**
0.13

`BytesOf(path: Path)`

### Parameters

`path` - The input

**Since**
0.13

`BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The input

`max` - Max length of the buffer for reading`BytesOf(rdr: Reader)`

### Parameters

`rdr` - Reader`BytesOf(rdr: Reader, charset: Charset)`
`BytesOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset`BytesOf(rdr: Reader, charset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`BytesOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset

`max` - Buffer size`BytesOf(rdr: Reader, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.3

`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`
`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`charset` - The charset`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source`BytesOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

### Parameters

`chars` - The chars`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`
`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`chars` - The chars

`charset` - The charset`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`
`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The source

`charset` - The charset`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`
`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)``BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: Charset)`
`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`error` - The exception to serialize

`charset` - Charset`BytesOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`

### Parameters

`bytes` - Bytes to encapsulate`BytesOf(origin: KBytes)`

A [Bytes](../../nnl.rocks.kactoos/-bytes/index.md) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.12
