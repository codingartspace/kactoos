[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [SyncOutput](.)

# SyncOutput

`class SyncOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/SyncOutput.kt#L18)

Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.md).

There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)``SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.md). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): OutputStream`<br>Get write access to it. |