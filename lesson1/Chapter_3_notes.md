# **Chapter 3 Decision Structures**
## **3.1 The if Statement**
The if statement is used to create a decision structure, which allows a program to have more than one path of execution. The if statement causes one or more statement to execute only when a boolean expression is true.

sequence structure - statements are executed in sequence, without branching off in another direction.

In a decision structure's simples form, a specific action is taken only when a condition exists. If the condition does not exist, the action is not performed.

A relational operator determines whether a specific relationship exists between two values.

Indentions and spacing are for the human readers of a program, not the compiler.

You do not put a semicolon after the if (expression) portion of an if statement.

This is because the if statement isn't complete without its conditionally executed statement.

If you prematurely terminate an if statement with a semicolon, the compiler will not display an error message, but will assume that you are placing a null statement there.

The if statement can also conditionally execute a group of statements, as long as they are enclosed in a set of braces. Enclosing a group of statements inside braces creates a block of statements.

## **3.2 The if-else Statement**
The if-else statement will execute one group of statements if its boolean expression is true, or another group if its boolean expression is false.

## **3.3 Nested if Statements**
To test more than one condition, an if statement can be nested inside another if statement.

## **3.4 The if-else-if Statement**
The if-else-if statement tests a series of conditions. It is often simpler to test a series of conditions with the if-else-if statement than with a set of nested if-else statements.

## **3.5 Logical Operators**
Logical operators connect two or more relational expressions into one or reverse the logic of an expression.

The && operator is know a the logical AND operator. It takes two boolean expressions as operands and creates a boolean expression that is true only when both subexpressions are true.

The || operator is known as the logical OR operator. It takes two boolean expressions as operands and creates a boolean expression that is true when either of the subexpressions is true.

The ! Operator performs a logical NOT operation. It is a unary operator that takes a boolean expression as its operand and reverses its logical value.
In other words, if the expression is true, the ! operator returns false, and if the expression is false, it returns true.
The ! operator has a higher precedence than many of Java's other operators.
When determining whether a number is inside a range, it's best to use the && operator.

## **3.6 Comparing String Objects**
You cannot use relational operators to compare String objects. Instead you must use a String method.