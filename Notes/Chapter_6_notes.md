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

### **Writing the Code for a Class**
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

### **Writing the setLength Method**
This method will allow code outside class to store a value in the length field.

```java
/**
  Rectangle class, phase 1
  Under construction
*/

public class Rectangle
{
	private double length;
	private double width;

	/**
	  The setLength method stores a value in the
	  length field.
	  @param len The value to store in length.
	*/
	
	public void setLength(double len)
	{
		length = len;
	}
}
```

It's important always to write comments that describe a class's methods so that in the future, anyone reading the code will understand it.

Notice that the word **static** does not appear in the method header.
When a method is designed to work on an instance of a class, it is referred to as an *instance method*, and you do not write the word **static** in the header.
Because this method will store a value in the length field of an instance of the Rectangle class, it is an instance method.
When the method executes the len parameter variable will hold the value of an argument that is passed to the method. That value is assigned to the **length** field.
Notice that the Rectangle class does not have a main method. This class is not a complete program.
Other programs will use the Rectangle class to create objects.
The programs that create and use these objects will have their own main methods.

```java
/**
  This program demonstrates the Rectangle class's setLength method.
*/

public class LengthDemo
{
	public static void main(String[] args)
	{
		// Create a Rectangle object and assign its
		// address to the box variables.
		Rectangle box = new Rectangle();

		// Indicate what we are doing.
		System.out.println("Sending the value of 10.0 " + 
					"to the setLength method.");
		
		// Call the box object's setLength method.
		box.setLength(10.0);

		// Indicate we are done.
		System.out.println("Done.");
	}
}
```

```java
// Program Output
Sending the value 10.0 to the setLength method.
```

The file using the method/class should be in the same folder or directory as the file **Rectangle.java**.
When the compiler reds the source code for lengthDemo.java and sees that a class named Rectangle is being used, it looks in the current folder or directory for the file Rectangle.class.
That file does not exist, however, because we have not yet compiled Rectangle.java.
The compiler searches for the file Rectangle.java and compiles it.
This creates the file Rectangle.class, which makes the Rectangle class available.
The compiler then finishes compiling LengthDemo.java.
All of a class's numeric fields are initialized to 0 by default.

The setWidth method is similar to setLength. It accepts an argument, which is assigned to the width field.
```java
/**
	Rectangle class, phase 2
	Under consturction!
*/

public class Rectangle
{
	private double length;
	private double width;

	/**
		The setLength method stores a value in the
		lenght field.
		@param len The value to store in length
	*/
	
	public void setLength(double len)
	{
		lenght = len;
	}

	/**
		The setWidth method stores a value in the width field.
		@param w The value to store in width.
	*/

	public void setWidth(double w)
	{
		width = w;
	}
}
```
The setWidth method has a parameter variable named w, which is assigned to the width field.

We must write methods that allow code outside the class to get the values that are stored in these field.
That's what the getLength and getWidth methods will do.
The getLength method will return the value stored in the length field, and the getWidth method will return the value stored in the width field.
Here is the code for the getLength method:
```java
public double getLength()
{
	return length;
}
```

The getWidth method is similar to getLength. The code for the method follows:
```java
public double getWidth()
{
	return width;
}
```

### **Writing the getArea Method**
The getArea method returns the area of a rectangle , which is its length multiplied by its width.
```java
public double getArea()
{
	return length * width;
}
```

```java
/**
	Rectangle class, phase 4
	Under construction
*/

public class Rectangle
{
	private double length;
	private double width;

	/**
		The setLength method stores a value in the
		lenght field.
		@param len The value to store in length
	*/
	
	public void setLength(double len)
	{
		lenght = len;
	}

	/**
		The setWidth method stores a value in the width field.
		@param w The value to store in width.
	*/

	public void setWidth(double w)
	{
		width = w;
	}

	/**
		The getLength method returns a Rectangle
		object's length.
		@return The value in the length field.
	*/

	public double getLength()
	{
		return length;
	}

	/**
		The getWidth method returns a Rectangle
		object's width.
		@return The value in the width field.
	*/

	public double getWidth()
	{
		return width;
	}

	/**
		The getArea method returns a Rectangle
		object's area.
		@return The product of length times width.
	*/

	public double getArea()
	{
		return length * width;
	}
}
```

**Using the Rectangle class**
```java
/**
	This program demonstrates the Rectangle class's
	setLength, setWidth, getLength, getWidth, and getArea methods.
*/

public class RectangleDemo
{
	public static void main(String[] args)
	{
		// Create a Rectangle object.
		Rectangle box = new Rectangle();

		// Set length to 10.0 and width to 20.0
		box.setLength(10.0);
		box.setWidth(20.0);

		// Display the length.
		System.out.println("The box'x length is " + box.getLength());

		// Display the width.
		System.out.println("The box'x width is " + box.getWidth());

		// Display the area.
		System.out.println("The box's area is " + box.getArea());
	}
}

// Program Output
// The box's length is 10.0
// The box's width is 20.0
// The box's area is 200.0
```

A method that gets a value from a class's field but does not change it is known as an **accessor method**.
A method that stores value in a field or changes the value of a field in some other way is known as a **mutator method**.
In the Rectangle class, the methods getLength and getWidth are accessors, and the methods setLength and setWidth are mutators.

Data hiding is an important concept in object-oriented programming.
You hide an object's internal data by making the class's fields private, and making the methods that access those fields public.
By hiding a class's data, and allowing it to be accessed only through the class's method, you can better ensure that the class will operate as you intended it to.

When the value of an item is dependent on other data and that item is not updated when the other data is changed, it is said that the item has become **stale**.

In a UML diagram, you have the option to place a **-** character before a member name to indicate that is is private, or a **+** character to indicate that it is public.
To indicate the data type of a field, place a colon followed by the name of the data type after the name of the field.

|First Section|
|:------------|
| Rectangle   |

|Second Section|
|:----------------------|
| - length : double		|
| - width : double		|

|Third Section|
|:----------------------------------|
| + setLength(len : double) : void	|
| + setWidth(w : double) : void		|
| + getLength() : double			|
| + getWidth() : double				|
| + getArea() : double				|

## **6.3 Instance Fields and Method**
Each instance of a class has its own set of fields, which are known as instance fields.
You can create several instance of a class and store different values in each instance's fields.
The methods that operate on an instance of a class are known as instance methods.

The methods that operate on an instance of a class are known as **instance methods**.

## **6.4 Constructors**
A constructor is a method that is automatically called when an object is created.
A constructor is a method that is automatically called when an instance of a class is created.
They are called "constructors" because they help construct an object.

Reference variables can also be declared without being initialized, as in the following statement:
```java
Rectangle box;
```

Because the box variable does not yet hold an object's address, it is an **uninitialized reference variable**.
After declaring the reference variable, the following statement can be used to assign it the address of an object.
A local reference variable must reference an object before it can be used. Otherwise a compiler error will occur.

When an object is created, its constructor is always called.
If you do not write a constructor in a class, Java automatically provides one when the class is compiled.
The constructor that Java provides is known as the **default constructor**.
The default constructor doesn't accept arguments.
It sets all of the objects's numeric fields to 0 and boolean fields to false.
If the object has any fields that are reference variables, the default constructor sets them to the special value null, which means they do not reference anything.
```java
// Now we wrote our own constructor for the Rectangle class.
Rectangle box = new Rectangle(); // Error! Must now pass arguments.
```
Because we have added our own constructor, which requires two arguments, the class no long has a default constructor.

A constructor that does not accept arguments is known as a **no-arg constructor**.

There is one class that can be instantiated without the new operator: the **String** class.

## **6.5 Passing Objects as Arguments**
When an object is passed as an argument to a method, the object's address is passed into the method's parameter variable.
As a result, the parameter references the object.

## **6.6 Overloading Methods and Constructors**
Two or more methods in a class may have the same name as long as their parameter list are different. This also applies to constructors.

When a method is **overloaded**, it means that multiple methods in the same class have the same name, but use different types of parameters.
Method overloading is important because sometimes you need several different ways to perform the same operation.

The process of matching a method call with the correct method is known as **binding**.
When an overloaded method is being called, Java uses the method's name and parameter list to determine which method to bind the call to.
A method's **signature** consists of the method's name and the data type of the method's parameters, in the order that they appear.

## **6.7 Scope of Instance Fields**
Instance fields are visible to all of the class's instance methods.

A parameter variable is, in essence, a local variable. So, you cannot give a parameter variable and a local variable in the same method the same name.
However, you can have a local variable or a parameter variable with the same name as a field.
When you do, the name of the local or parameter variable **shadow** the name of the field.