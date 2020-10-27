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
A loop is part of a program that repeats.
A loop is a control structure that causes a statement or group of statements to repeat.

The while loop has two important parts:
1. A boolean expression that is tested for a true or false value
2. A statement or block of statements that is repeated as long as the expression is true

Here's how the loop works:
* The BooleanExpression is tested, and if it is true, the Statement is executed.
* Then, the BooleanExpression is tested again. If its true, the Statement is executed.
* This cycle repeats until the BooleanExpression is false.
Each repetition of a loop is known as an iteration.

The while loop is known as a pretest loop, which means it tests its expression before each iteration.
An important characteristic of the while loop is that the loop will never iterate if the boolean expression is false to start with.
If you want to be sure that a while loop executes the first time, you must initialize the relevant data is such a way that the boolean expression starts out as true.

Loops must contain a way to terminate within themselves. This means that something inside the loop must eventually make the boolean expression false.
If a loop does not have a way of stopping, it is called an infinite loop as it continues to repeat until the program is interrupted.
It's also possible to create an infinite loop by accidently placing a semicolon after the first line of the while loop.
```java
int number = 1;
while (number <= 5); // This semicolon is an ERROR!
{
    System.out.println("Hello");
    number++;
}
```

## **4.3 Using the while Loop for Input Validation**
The while loop can be used to create input routines that repeat until acceptable data is entered.

*Input validation* is the process of inspecting data given to a program by the user and determining whether it is valid.

## **4.4 The do-while Loop**
The do-while loop is a posttest loop, which means its boolean expression is tested after each iteration.
The do-while loop must be terminated with a semicolon.
The do-while loop is a posttest loop. This means it does not test its boolean expression until it has completed an iteration.
As a result, the do-while loop always performs at least one iteration, even if the boolean expression is false to begin with.
You should use the do-while loop when you want to make sure the loop executes at least once.

## **4.5 The for Loop**
The for loop is ideal for performing a known number of iterations.