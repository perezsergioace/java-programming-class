# **Chapter 6 - A First Look at Classes**

## **6.1 - Objects and Classes**
An object is a software component that exists in memory and serves a specific purpose in a program.
An object is created from a class that contains code describing the object.

Most programming languages in use today are object-oriented. With an object-oriented language, such as Java, you create programs that are made of objects.

In software, an object has two general capabilities:
* An object can store data. The data stored in an object are commonly called *fields*.
* An object can perform operations. The operations that an object can perform are called *methods*.

A *class* is code that describes a particular type of object.
It specifies the data that an object can hold (the object's fields), and the actions that an object can perform (the object's methods).

A class is not an object, but a description of an object.
Each object that is created from a class is called an *instance* of the class.

When you are working with an object, you are typically using tow things:
* The object itself, which must be created in memory.
* A reference variable that refers to the object.

Creating an object typically requires the following two steps:
1. You declare a reference variable.
2. You create the object in memory, and assign its memory address to the reference variable.

## **6.2 - Writing a Simple Class, Step by Step**
You can write your own classes to create the objects that you need in a program.
 
When designing a class it is often helpful to draw a UML diagram.
UML stands for United Modeling Language.
It provides a set of standard diagrams for graphically depicting object-oriented systems.
The diagram is a box that is divided into three sections.
* The top section is where you write the name of the class.
* The middle section holds a list of the class's fields.
* The bottom section holds a list of the class's methods.

|First Section|
|:------------|
| Rectangle   |

|Second Section|
|:------------|
| length      |
| width       |

|Third Section|
|:------------|
| setLength() |
| setWidth()  |
| getLength() |
| getWidth()  |
| getArea()   |

**Writing the Code for a Class**
First, create a new file named *Rectangle.java*
In the file we will start by writing a general class "skeleton" as follows:
```java
public class Rectangle
{

}
```
The key word **public**, which appears in the first line, is an access specifier.
An access specifier indicates how the class may be accessed.
The public access specifier indicates the the class will be publicly available to code that is written outside the *Rectangle.java* file.
In general terms, the fields and methods that belong to a class are referred to as the class's members.

First we will write the code for the class's two fields, **length** and **width**.
We will use variables of the double data type for the fields.
```java
public class Rectangle
{
	private double length;
	private double width;
}
```
Notice that both declarations begin with the key word **private**, preceding the data type.
The key word **private** is an access specifier.
It indicates that these variables may not be accessed by statements outside the class.

By using the private access modifier, a class can hide its data from code outside the class.
When a class's fields are hidden from outside code, the data is protected from accidental corruption.
