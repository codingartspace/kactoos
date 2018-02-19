---
title: TempFile - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [TempFile](./index.html)

# TempFile

`class TempFile : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TempFile.kt#L32)

A temporary file.

These are ephemeral files to be used in small scopes.
Typical use looks like this:

```
try (final TempFile file = new TempFile()) {
    //write to the file
}
```

The physical file is deleted from the filesystem when the temp file is
closed.

### Parameters

`file` - Creates the file and returns the path to it

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `TempFile(prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")`<br>The temporary file will be created inside the filesystem's temporary folder (system property: `java.io.tmpdir`).`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, suffix: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)` |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Deletes the file from the filesystem. |
| [value](value.html) | `fun value(): `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)<br>Convert it to the value. |
