# **Chapter 4 Loops and Files**
## **4.1 The Increment and Decrement Operators**
++ and -- are operators that add and subtract one from their operands.
To *increment* a value means to increase it by one, and to *decrement* a value means to decrease it by one.

```java
// Both of the following statements increment the variable number:
number = number + 1;
number += 1;

// And number is decremented in both of the following statements:
number = number - 1;
number -= number;
```

Java provides a set of simple unary operators designed just for incrementing and decrementing variables.
```java
// The following statement uses the ++ operator to increment number:
number++;

// And the following statement decrements number:
number--;
```

The operators also work in *prefix mode*, where the operator is placed before the variable name as follows:
```java
++number;
--number;
```

## **4.2 The while Loop**