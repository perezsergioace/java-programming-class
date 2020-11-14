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