# Interfaces Pre-Work


## Instructions
Open `ReversedString` in the `src/com/amazon/ata/interfaces` package. In this try, you will update
`ReversedString` to implement the [CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)
interface found in the java.lang package. The constructor of `ReversedString` accepts a `String` which will
be the sequence of characters that your class will provide access to in reverse order.

When implementing the `CharSequnce` interface you should override the following three methods:
- `charAt(int index)`
  - If we create a `ReversedString` with the value "cat", `charAt(0)` should return 't'.
- `length()`
  - If we create a `ReversedString` with the value "cat", `length()` should return 3.
- `subSequence(int start, int end)`
  - If we create a `ReversedString` with the value "cat", `subSequence(0, 2)` should return "ta".

Note that `CharSequence` comes with two default methods `chars()` and `codePoints` that you do not need to override.
Interface default methods come with implementations that you can override if you wish. You do not need to understand
what interface default methods are right now.

You should also override the `toString()` method. This method should print your `ReversedString`.
  - If we create a `ReversedString` with the value 'cat', `toString()` should return 'tac'.

NOTE: Here we're actually overriding the default implementation of `toString()` that
we get from the Java `Object` class. More on this in a later lesson (Inheritance).

### Implement `ReversedString`

Go ahead and implement the methods indicated above. When you think you're pretty
close, or have at least declared the necessary methods, you can start looking
at the test class below to start to check that you're on the right path.

### Tests

The test class `ReversedStringTest` has tests that are currently testing the `String` class and not your
`ReversedString` class. `String` also implements the `CharSequence` interface.

However, the tests were written to verify the behavior of `ReversedString`,
so a few of the tests are currently failing. Your job will be to implement
the `ReversedString` class, and get all of the unit tests here passing
by using your `ReversedString` implementation instead of `String`.

Note that many of the tests will be passing, as `String` and `ReversedString`
will behave identically in several cases (index out of bounds, `null` etc.).

Open up the class and take a look at the test `charAt_firstIndex_returnsFirstChar`,
it should be the first one in the file. In the first two lines, we are
initializing a `CharSequence` (the type on the left side of the equal sign).
```
        // GIVEN - "nozama"
        CharSequence sequence = new String("amazon");
```
However, the implementation we are using is `String` (the right side of the equal sign). Let's update this test to use
the implementation you have just created for `CharSequence`, `ReversedString`. All we need to do is swap `String` for
`ReversedString` like we show below.
```
        // GIVEN - "nozama"
        CharSequence sequence = new ReversedString("amazon");
```

**Update each test so that it is using the `ReversedString` class instead of `String`.
You will need to do this for each test in the `ReversedStringTest` class.** Hint:
hit Cmd-R, and replace "new String" with "new ReversedString" and click "Replace all"
(We recommend at least declaring your methods in `ReversedString` before doing this
so that your test class compiles.)

We just demonstrated Polymorphism. When you code to an interface, all you need to do to change to a different type that
implements the same interface is update the right hand side of the equal sign to specify the new type you want to use.
We didn't have to change any additional code because our code was using methods defined by `CharSequence`, and both
`String` and `ReversedString` follow the same contract by implementing `CharSequence`.

You should not need to make any other updates to the test code. The rest is up to your
`ReversedString` class!

## Goal

When all of the unit tests are testing `ReversedString`, and they are all
passing, you are finished with this try!
