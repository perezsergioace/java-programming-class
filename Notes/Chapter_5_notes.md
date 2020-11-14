# **Chapter 5 - Methods**
## **5.1 - Introducing to Methods**
Methods can be used to break a complex program into small, manageable pieces.
A **void** method simply executes a group of statements and then terminates.
A value-returning method returns a value to the statement that called it.

In a general sense, a method is a collection of statements that performs a specific task.
Methods are commonly used to break a problem into small, manageable pieces.
Instead of writing one long method that contains all of the statements necessary to solve a problem, several small methods that each solve a specific part of the problem can be written.
These small methods can then be executed in the desired order to solve the problem.
This approach is sometimes called divide and conquer because a large problem is divided into several smaller problems that are easily solved.

The benefit of using methods is known as *code reuse* because you are writing the code to perform a task once and then reusing it each time you need to perform the task.

There are two general categories of methods: void methods and value-returning methods.
A *void method* is one that simply performs a task and then terminates.
A *value-returning method* not only performs a task but also sends a value back to the code that called it.

To create a method you must write its *definition*, which consists of two general parts: a header and a body.

The *method header*, which appears at the beginning of a method definition, lists several important things about the method, including the method's name.
The *method body* is a collection of statements that are performed when the method is executed. These statements are enclosed inside a set of curly braces.
```java
public static void main(String[] args)      // Header
{
    System.out.println("Hello World!");     // Body
}
```

Every complete Java program must have a **main** method.
Java programs can have other methods as well.

* Method modifiers - The key words *public* and *static* are modifiers. The word *public* means that the method is publicly available to code outside the class. The word *static* means that the method belongs to the class, not a specific object.
* Return Type - When the keyword *void* appears here, it means that the method is a void method, and does not return a value.
* Method name - You should each method a descriptive name. In general, the same rules that apply to variable names also apply to method names.
* Parentheses - In the header, the method name is always followed by a set of parentheses. Methods can be capable of receiving arguments. When this is the case, a list of one or more variable declarations will appear inside the parentheses. The method in this example does not receive any arguments, so the parentheses are empty.
**The method header is never terminated with a semicolon.**

A method executes when it is called. The **main** method is automatically called when a program starts, but other methods are executed by method call statements. 
Method call statements may be used in control structures like loops, if statements, and switch statements.

Methods can also be called in layered fashion. In other words, method A can call method B, which can then call method C. 

You should always document a method by writing comments that appear just before the method's definition.
The comments should provide a brief explanation of the method's purpose.

## **5.2 - Passing Arguments to a Method**
A method may be written so it accepts arguments.
Data can then be passed into the method when it is called.

Values that are sent into a method are called arguments.
By using parameter variables, you can design your own methods that accept data this way.
A **parameter variable**, sometimes simply referred to as a **parameter**, is a special variable that holds a value being passed into a method.
```java
public static void displayValue(int num)
{
	System.out.println("The value is " + num);
}

displayValue(5);

Output: The value is 5
```

You may also pass the contents of variables and the values of expressions as arguments.
```java
displayValue(x);
displayValue(x * 4);
displayValue(Integer.parseInt("700"));
```

**Warning** - When passing a variable as an argument, simply write the variable name inside the parentheses of the method call. Do not write the data type of the argument variable in the method call.
```java
displayValue(int x);	// Error!
// The method call should appear as follows:
displayValue(x);	// Correct
```

Some call the arguments *actual parameters* and call the parameters *formal parameters*.
Others use the terms *actual argument* and *formal argument*.

When passing an argument to a method, be sure that the argument's data type is compatible with the parameter variable's data type.
Java will automatically perform a widening conversion if the argument's data type is ranked lower than the parameter variable's data type.
However, Java will not automatically convert an argument to a lower-ranking data type. This means that a long, float, or double value cannot be passed to a method that has an int parameter variable.

Often it is useful to pass more than one argument to a method. Here is a method that accepts two arguments.
```java
public static void showSum(double num1, double num2)
{
	double sum;	// To hold the sum
	
	sum = num1 + num2;
	System.out.println("The sum is " + sum);
}

showSum(5, 10);
```
Notice that tow parameter variables, num1 and num2, are declared inside the parentheses in the method header. This is often referred to as a **parameter list**.

**Warning** - Each parameter variable in a parameter list must have a data type listed before its name. A data type for both the parameter variables must be listed.

You can also write methods that accept references to objects as arguments.

String objects in Java are immutable, which means that they cannot be changed.

## **5.3 - More about Local Variables**
A local variable is declared inside a method and it not accessible to statements outside the method.
Different methods can have local variables with the same names because the methods cannot see each other's local variables.

Because a method's local variables are hidden from other methods, the other methods may have their own local variables with the same name.

A method's local variables exist only, while the method is executing.
This is known as the **lifetime** of a local variable.
When the method begins, its local variables and its parameter variables are created in memory, and when the method ends, the local variables and parameter variables are destroyed.
This means that any value stored in a local variable is lost between calls to the method in which the variable is declared.

Methods can be written like this:
```java
public static void showSum(double num1, double num2)
{
	double sum;	// to hold the sum
	
	sum = num1 + num2;
	System.out.println("The sum is " + sum);
}
```

But can also be written like this:
```java
public static void showSum(double num1, double num2)
{
	double sum = num1 + num2;
	System.out.println("The sum is " + sum);
}
```

Local variables are not automatically initialized with a default value.
They must be given a value before they can be used.
If you attempt to use a local variable before it has been given a value, a compiler error will result.
```java
public static void myMethod()
{
	int x;
	System.out.println(x);	// Error! x has no value.
}
```

## **5.4 - Returning a Value from a Method**
A method may send a value back to the statement that called the method.

Methods that return a value are appropriately know as **value-returning methods**
