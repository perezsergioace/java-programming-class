# **Chapter 2 Java Fundamentals**

## **2.1 The Parts of a Java Program**
A Java program has parts that serve specific purposes.

Example:
```java
// This is a simple Java Program.
public class Simple
{
    public static void main(String[] args)
    {
        System.out.println("Programming is great fun!");
    }
}
```

// marks the beginning of a comment.

**public class Simple**: This line is known as a class header, and it marks the beginning of a class definition.

A Java program must have at least one class definition.

* public is a Java keyword, and it must be written in all lowercase letters. It is knows as an access specifier, and it controls where the class may be accessed from. The public specifier means access to the class is unrestricted. (In other words, the class is "open to the public.")

* class, which must also be written in lowercase letters, is a Java key word that indicates the beginning of a class definition.

* Simple is the class name. This name was made up by the programmer. The class could have been called Pizza, or Dog, or anything else the programmer wanted. Programmer-defined names may be written in lowercase letters, uppercase letters, or a mixture of both.

* You may create more than one class in a file, but you may have only one public class per Java file.

* When a Java file has a public class, the name of the public class must be the same as the name of the file (without the .java extension).

Java is a case-sensitive language. That means it regards uppercase letters as being entirely different characters than their lowercase counterparts.

All of the programming statements that are part of the class are enclosed in a set of braces.

Everything between the two braces is the body of the class.

Line 5 reads:

```java
public static void main(String[] args)
```

This line is know as a method header. It marks the beginning of a method.

When creating a method, you must tell the compiler several things about it.

Should just be concerned about the name of the method **main**, and the rest of the words are required for the method to be properly defined.

Remember from Chapter 1 that every Java application must have a method name **main**. The **main** method is the starting point of an application.

Everything between the nest curly braces is the **body** of the **main** method.

The group of characters inside the quotation marks is called a **string literal**.

At the end of a the line is a semicolon.

A semicolon marks the end of a statement in Java. Not every line of code ends with a semicolon.

* Comments do not have to end with a semicolon because they are ignored by the compiler.
* Class headers and method header do not end with a semicolon because they are terminated with a body of code inside braces.
* The brace characters, { and }, are not statements, so you do not place a semicolon after them.

## **2.2 The print and println Methods, and the Java API**
The print and println methods are used to display text output. They are part of the API, which is a collection of prewritten classes and methods for performing specific operations.

The simplest type of output that a program can display on the screen is console output.

The term API stands for Application Programmer Interface.

The System **System** class contains objects and methods that perform system-level operations. One of the objects contained in the **System** class is named out.

The out object has methods, such as print and println.

The println method displays its message and then advances the cursor to the beginning of the next line.

The print method, however, does not advance the cursor to the next line after its message is displayed.

Use escape sequences to separate the output into different lines. As escape sequence starts with the backslash character (\), and its  followed by one or more control characters.

```java
public class Adjust
{
    public static void main(String[] args)
    {
        System.out.print("There are our top sellers:\n");
        System.out.print("Computer games\nCoffee\n");
        System.out.println("Asprin");
    }
}

// Program Output
// There are our top sellers:
// Computer games
// Coffee
// Asprin
```

Do not put a space between the backslash and the control characters.

## **2.3 Variables and Literals**
A variable is a named storage location in the computer's memory. A literal is a value that is written into the code of a program.

```java
// This program has a variable.

public class Variable
{
    public static void main(String[] args)
    {
        int value;

        value = 5;
        System.out.print("The value is ");
        System.out.println(value);
    }
}

// Program Output
// The value is 5
```

line 7: int value;
This is called a variable declaration.

Variables must be declared before they can be used.

line 9: value = 5
This is called an assignment statement.

You can use the + operator to concatenate the contents of a variable to a string.
The following code shows an example:

```java
int number;

number = 5;
System.out.println("The value is" + number);

// Output
// The value is 5
```

You may choose your own variable names and class names in Java, as long as you do not use any of the Java key words.

It is a standard practice to capitalize the first letter of a class name, as well as the first letter of each subsequent word it contains.

This helps differentiate the names of variables from the names of classes.

For example, payRate would be a variable name, and Employee would be a class name.

## **2.4 Primitive Data Types**
There are many different types of data. Variables are classified according to their data type, which determines the kind of data that may be stored in them.

Each variable has a data type, which is the type of data that the variable ca hold.

With the primitive data types, you can only create variables, and a variable can only be used to hold a single value.

If a program uses three integers, length, width, and area, they could be declared separately, as follows:
```java
int length;
int width;
int area;
```

It is easier, however, to combine the three variable declarations:
```java
int length, width, area;
```

You can declare several variables of the same type, simply by separating their names with commas.

In Java there are two data types that can represent floating0point numbers. They are **float** and **double**.

A **float** variable occupies 4 bytes of memory, whereas a **double** variable uses 8 bytes.

java is a strongly typed language, which means that it only allows you to store values of compatible data types in variables.

The boolean data type may hold  two possible values: true or false.

The contents of a boolean variable may not be copied to a variable of any type other than boolean.

The **char** data type is used to store characters. A variable of the char data type can hold one character at a time.
Characters literals are enclosed in a **single quotation marks**.

## **2.5 Arithmetic Operators**
There are many operators for manipulating numeric values and performing arithmetic operations.

Generally, there are three types of operators: unary, binary, and ternary.

Binary operators work with two operands.

Ternary operators require three operands.

When both operands of the division operator are integers, the operator will perform integer division.
In order for a division operation to return a floating-point value, one of the operands must be of a floating-point data type.

## **2.6 Combined Assignment Operators**
The combined assignment operators combine the assignment operator with the arithmetic operators.

## **2.7 Conversion between Primitive Data Types**
Before a value can be stored in a variable, the value's data type must be compatible with the variable's data type.

Java automatically converts the lower-ranked value to the higher-ranked type. This is called a *widening conversion*.

A narrowing conversion is the conversion of a value to a lower-ranked type. Because narrowing conversions can potentially cause a loss of data, Java does not automatically perform them.

The cast operator lets you manually convert a value, even if it means that a narrowing conversion will take place.

## **2.8 Creating Named Constants with final**
The final key word can be used in a variable declaration make the variable a named constant. Named constants are initialized with a value, and that value cannot change during the execution of the program.

## **2.9 The String Class**
The **String** class allows you to create objects for holding strings. It also has various methods that allow you to work with strings.

Each object that is created from a class is called an instance of the class.

The first step in using the String class is to declare a variable of the String class data type.

Remember that String is a class, not a primitive data type.

## **2.10 Scope**
A variable's scope is the part of the program that has access to the variable.

A variable is visible only to statements inside the variable's scope.

Variables that are declared inside a method are called local variables.

The variable cannot be accessed by statements that are outside this region.
This means that a local variable cannot be accessed by statements that are outside this region.

Another rule is that you cannot have two local variables with the same name in the same scope.

## **2.11 Comments**
Comments are notes of explanation that document lines or sections of a program.
Comments are part of the program, but the compiler ignores them.
They are intended for people who may be reading the source code.

Any comment that starts with /** and end with */ is considered a documentation comment.
```java
/**
 * This class creates a program that calculates company payroll.
*/

public class Comment3
{
    /**
     * The main method is the program's starting point.
    */

    public static void main(String[] args)
    {
    double payRate;         // Holds the hourly pay rate
    double hours;           // Holds the hours worked
    int employeeNumber;     // Hold the employee number

    // The Remained of This program is Omitted.
    }
}
```