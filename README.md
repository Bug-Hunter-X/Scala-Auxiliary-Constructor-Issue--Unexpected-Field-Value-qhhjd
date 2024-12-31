# Scala Auxiliary Constructor Issue: Unexpected Field Value

This repository demonstrates a subtle issue related to auxiliary constructors in Scala.  When an auxiliary constructor initializes a field in the primary constructor, accessing this field through different instantiation methods may lead to unexpected values. This can be a source of errors during development.

## Problem Description

The provided `MyClass.scala` shows a class with a primary constructor and an auxiliary constructor. While the primary constructor initializes a field `x`, the auxiliary constructor doesn't explicitly set it, resulting in it being initialized to a default value through the `this()` call.  This may differ from what one might intuitively expect.

## Solution

The solution is in the `MyClassSolution.scala` file. We explicitly initialize `x` in the auxillary constructor to ensure consistency.

## How to Reproduce

1. Clone this repository.
2. Navigate to the directory containing `MyClass.scala`.
3. Compile and run the file using a Scala compiler.
4. Observe the output; you'll see inconsistent values when accessing the `x` field via different constructor calls.
5. Repeat steps 2-4 with `MyClassSolution.scala` to see the correct behaviour.

## Related Issues

This subtle issue can lead to unexpected behavior when dealing with fields initialized in the primary constructor and accessed through auxiliary constructors. Understanding how the `this()` call works in auxiliary constructors is essential to avoid this kind of error.