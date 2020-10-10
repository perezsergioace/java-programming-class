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