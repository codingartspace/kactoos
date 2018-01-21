[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputWithFallback](.)

# InputWithFallback

`class InputWithFallback : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/InputWithFallback.kt#L22)

Input that returns an alternative input if the main one throws
[IOException](#).

There is no thread-safety guarantee.

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alt: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alt: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<IOException, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>)``InputWithFallback(main: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alternative: `[`IoCheckedFunc`](../../nnl.rocks.kactoos.func/-io-checked-func/index.md)`<IOException, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>)`<br>Input that returns an alternative input if the main one throws [IOException](#). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): InputStream`<br>Get read access to it. |