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

A String object is referenced by a variable that contains the object's memory address. When you use a relational operator with the reference variable, the operator works on the memory address that the variable contains, not the contents of the String object.

To compare the content of two String objects correctly, you should use the String class's equals method. The general form of the method is as follows:
```java
StringReference1.equals(StringREference2)
```
the method returns true if the two strings are equal, or false if they are not equal.
```java
String name1 = "Mark";
String name2 = "Mary";
if (name1.equals(name2))
```
The expression in the if statement will return true if they are the same, or false if they are not the same.
You can also compare String objects to string literals. Simply pass the string literal as the argument to the equals method, as follows:
```java
if (name1.equals("Mark"))
```
To determine whether two strings are not equal, simply apply the ! operator to the equals method's return value. Here is an example:
```java
if (!name1.equals("Marks"))
```

The equals and compareTo methods perform case-sensitive comparisons, which means that uppercase letters are not considered the same as their lowercase counterparts.

The String class provides the equalsIgnoreCase and compareToIgnoreCase methods.
These methods work like the equals and compareTo methods, except the case of the characters in the strings is ignored.

## **3.7 More about Variable Declaration and Scope**
The scope of a variable is limited to the block in which it is declared.

A local variable's scope always starts at the variable's declaration, and ends at the closing brace of the block of code in which it is declared.

## **3.8 The Conditional Operator (Optional)**
You can use the conditional operator to create short expressions that work like if-else statements.
The conditional operator is powerful and unique. Because it takes three operands, it is considered a ternary operator.
The conditional operator provides a shorthand method of expressing a simple if-else statement.
The operator consists of the question mark and the colon.
```java
BooleanExpression ? Value1 : Value2;
```
```java
y = x < 0 ? 10: 20;
```
The preceding statement performs the same operations as the following if-else statement:
```java
if (x < 0)
    y = 10
else
    y = 20
```

## **3.9 The switch Statement**
The switch statement lets the value of a variable or expression determine where the program will branch to.
The switch statement is a multiple alternative decision structure. It allows you to test the value of a variable or an expression and then use that value to determine which statement or set of statements to execute.

A case section begins with the word case, followed by a value, followed by a colon. Each case section contains one or more statements, followed by a break statement.
After all of the case sections, an optional default section appears.

If the testExpression does not match any of the case values, the program branches to the default statement and executes the statements that immediately follow it.

The switch statement can be used as an alternative to an if-else-if statement that compares the same variable or expression to several different values.
The default section is optional. If you leave it out, however, the program will have nowhere to branch to if the testExpression doesn't match any of the case values.

## **3.10 Displaying Formatted Output with System.out.printf and String.format**
The System.out.printf method allows you to format output in a variety of ways. The String.format method allows you to format a string, without displaying it. The string can be displayed at a later time.
```java
double sales = 12345.67
System.out.printf("Our sales are %f for the day.\n", sales);

// Output: Our sales are 12345.67 for the day.
```
The letter f in the format specifier is a conversion character that indicates the data type of the argument that is being formatted.
You use the f conversion character with any argument that is a float or a double.

If you want to format an integer value, you must use the %d format specifier. The d conversion character stands for decimal integer, and it can be used with arguments of the int, short, and long data types.
```java
int hours = 40
System.out.printf("I worked %d hours this week.\n", hours);

// Output: I worked 40 hours this week.
```

Keep in mind that %f must be used with floating-point values, and %d must be used with integer values. Otherwise, an error will occur at runtime.

Precision - You can change the number of decimal points that are displayed.
```java
double temp = 78.42819
System.out.printf("The temperature is %.2f degrees.\n", temp);

// Output: The temperature is 78.43 degrees.
```
Keep in mind that you can specify precision only with floating-point point values. If you specify a precision with the %d format specifier, an error will occur at runtime.

You can format a number with comma separators by inserting a comma (,) flag into the format specifier.
```java
double amount = 1234567.89;
System.out.printf("%,f\n", amount);

// Output: 1,234,567.890000
```

```java
double sales = 28756.89
System.out.printf("Sales for the month are %,.2f\n", sales);

// Output: 28,756.89
```

If you wish to print a string argument, use the %s format specifier.
```java
String name = "Ringo";
System.out.printf("Your name is %s\n", name);

// Output: Your name is Ringo
```

The following example shows how you can print arguments of different data types:
```java
int hour = 40;
double pay = hours * 25;
String name = "Jay";
System.out.printf("Nmae: %s, Hours: %d, Pay: $%,.2f\n", name, hours, pay);

// Output: Name: Jay, Hours: 40, Pay: $1,000.00
```

Java provides much more powerful format specifiers for more complex formatting needs.