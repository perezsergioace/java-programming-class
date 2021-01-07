# **Chapter 7 - Arrays and the ArrayList class**

## **7.1 - Introduction to Arrays**
An array can hold multiple values of the same data type simultaneously.
An array is an object that can store a group of values, all of the same type.
You declare a reference variable and use the new key word to create an instance of the array in memory.
Example:
```java
numbers = new int[6];
```
The number inside the brackets is the array's *size declarator*.
It indicates the number of elements, or values the array can hold.

As with any other type of object, it is possible to declare a reference variable and create an instance of an array with one statement.
```java
int[] numbers = new int[6];
float[] temperatures = new float[100];
char[] letters = new char[41];
long[] units = new long[50];
double[] sizes = new double[1200];
```
**Note**: Once an array is created, its size cannot be changes.

Each element is assigned a number known as a subscript.
A subscript is used as an index to pinpoint a specific element within an array.
Subscript numbering always starts at zero.

Java performs array bounds checking, which means that it does not allow a statement to use a subscript that is outside the range of valid subscripts for an array.
The Java compiler does not display an error message when it processes a statement that uses an invalid subscript.
Instead, when the statement executes, the program throws an exception and immediately terminates.

The series of values inside the braces and separated with commas is called an initialization list. 
You do not use the new key word when you use an initialization list.
Alternate array declaration can be written as follows:
```java
int numbers[];
```

## **7.2 - Processing Array Elements**
Individual array elements are processed like any other type of variable.
Each array in Java has a public field named length.
This field contains the number of elements in the array.
```java
double[] temperatures = new double[25];
size = temperatures.length;
```
The largest subscript in an array is length - 1.
**Note**: You cannot change the value of an array's length field.

The enhanced for loop is designed to iterate once for every element in an array.
Each time the loop iterates, it copies an array element to a variable.

```java
int[] array1 = {1, 2, 3, 4 , 5}
int[] array2 = array1;	// This does not copy array1.
```
This makes a copy of the address that is stored in array1 and stores it in array2.
After this statement executes, both the array1 and array2 variables will reference the same array.
This type of assignment operations is called a *reference copy*.
Only the address of the array object is copied, not the contents of the array object.
Instead, to copy an array you need to copy the individual elements of one array to another.
Usually, this is best done with a loop.

## **7.3 - Passing Arrays as Arguments to Methods**
An array can be passed as an argument to a method. To pass an array, you pass the value in the variable that references the array.

## **7.4 - Some Useful Array Algorithms and Operations Comparing Arrays**
To compare the contents of two arrays, you must compare the elements of the two arrays.
To sum the values in an array you must use a loop with an accumulator variable. The loops adds the value in each array element to the accumulator.
The first step in calculating the average of all the values in an array is to sum the values. The second step is to divide the sum by the number of elements in the array.

Finding the Highest and Lowest Values in a Numeric Array: First we copy the value in the first array element to the variable highest. Then the loop compares all of the remaining array elements, beginning at subscript 1, to the value in the highest. Each time it finds a value in the array that is greater than highest, it copies that value to highest. When the loops has finished, highest will contain the highest value in the array.
Find the lowest value in a numeric array is nearly identical.

## **7.5 - Returning Arrays from Methods**
In addition to accepting arrays as arguments, methods may also return arrays.
A method can return a reference to an array. To do so, the return type of the method must be declared properly. For example, look at the following method definition:
```java
public static double[] getArray()
{
	double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };
	return array;
}
```

## **7.6 - String Arrays**
An array of String objects may be created, but if the array is uninitialized, each String in the array must be created individually.
```java
String[] names = { "Bill", "Susan", "Steven", "Jean" };
```
When you create an uninitialized array of String objects, you must assign a value to each element in the array that you intend to use.

## **7.7 - Arrays of Objects**
You may create arrays of objects that are instances of classes that you have written.

## **7.8 - The Sequential Search Algorithm**
A search algorithm is a method of locating a specific item in a larger collection of data.
The sequential search algorithm uses a loop to sequentially step through an array, starting with the first element. It compares each element with the value being searched for and stops when the value is found or the end of the array is encountered. If the value being searched for is not in the array, the algorithm unsuccessfully searches to the end of the array.

## **7.9 - Two-Dimensional Arrays**
A two-dimensional array is aan array of arrays. It can be thought of as having rows and columns.
The arrays that you have studied so far are one-dimensional arrays. They are called *one dimensional* because they can hold only one set of data.
Two-dimensional arrays, which are sometimes called *2D arrays*, can hold multiple sets of data.

To declare a two-dimensional array, two sets of brackets and two size declarators are required: The first one is for the number of rows and the second one is for the number of columns.
```java
double[][] scores = new double[3][4];
```

When initializing a two-dimensional array, you enclose each row's initialization list in its own set of braces.
```java
int[][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
```

To sum all the elements of a two-dimensional array, you can use a pair of nested loops to add the contents of each element to an accumulator.

Two-dimensional array passed into a method:
```java
private static void showArray(int[][] array)
```

When the rows of a two-dimensional array are of different lengths, the array is known as a ragged array.
You create a ragged array by first creating a two-dimensional array with a specific number of rows, but no columns. Next, you create the individual rows.

## **7.10 - Arrays with Three or More Dimensions**
Java does not limit the number of dimensions that an array may have. It is possible to create arrays with multiple dimensions, to model data that occurs in multiple sets.

## **7.11 - The Selection Sort and the Binary Search Algorithm**
A sorting algorithm is used to arrange data into some order. The selection sort and the binary search are popular sorting and searching algorithms.

The *selection sort* works likes this: The smallest value in the array is located and moved to element 0. Then the next smallest value is located and moved to element 1. This process continues until all of the elements have been placed in their proper order.

## **7.12 - Command-Line Arguments and Variable-Length Argument Lists**
When you invoke a Java program from the operating system command line, you can specify arguments that are passed into the main method of the program. In addition, you can write a method that takes a variable number of arguments. When the method runs, it cann determine the number of arguments that were passed to it and act accordingly.

Java provides a mechanism known as *variable-length argument lists*, which makes it possible to write a method that takes a variable number of arguments.
```java
public static int sum(int... numbers)
{
	int total = 0; // Accumulator

	// Add all the values in the numbers array.
	for (int val : numbers)
		total += val;

	// Return the total.
	return total;
}
```
Notice the declaration of the numbers parameter in the method header. The ellipsis (three periods) that follows the data type indicates that numbers is a special type of parameter known as a *vararg parameter*. A vararg parameter can take a variable number of arguments. In fact, vararg parameters are actually arrays.

## **7.13 - The ArrayList Class**
ArrayList is a class in the Java API that is similar to an array and allows you to store objects. Unlike an array, and ArrayList object's size is automatically adjusted to accommodate the number of items being stored in it.
ArrayList object is similar to an array of objects, but offers many advantages over an array.
* An ArrayList object automatically expands as items are added to it.
* In addition to adding items to an ArrayList, you can remove item as well.
* An ArrayList object automatically shrinks as items are removed from it.
The ArrayList class is in the java.util package, so the following import statement is required:
```java
import java.util.ArrayList;
```

```java
ArrayList<String> nameList = new ArrayList<String>();

nameList.add("James");
nameList.add("Catherine");
nameList.add("Bill");
```
The items that are stored in an ArrayList have a corresponding index.
The ArrayList class has a size method that reports the number of items stored in an ArrayList. It returns the number of items as an int.
The ArrayList class's get method returns the item stored at a specific index. You pass the index as an argument to the method.

The ArrayList class has a **toString** method that returns a string representing all of the items stored in an ArrayList object.

The ArrayList class has a remove method that removes an item at a specific index. You pass the index as an argument to the method.

The ArrayList class has an overloaded version of the add method that allows you to add an item at a specific index. This causes the item to be inserted into the ArrayList object at a specific position.
```java
// Now insert an item at index 1.
nameList.add(1, "Mary");
```

The ArrayList class's set method can be used to replace an item at a specific index with another item. For example, the following statement will replace the item currently at index 1 with the String "Jennifer":
```java
nameList.set(1, "Jennifer");
```

An ArrayList object also has a *capacity*, which is the number of items it can store without having to increase its size. When an ArrayList object is first created, using the no-arg constructor, it has an initial capacity of 10 items. this means that it can hold up to 10 items without having to increase its size. When the eleventh item is added, the ArrayList object must increase its size to accommodate the new item. You can specify a different starting capacity, if you desire, by passing an int argument to the ArrayList constructor.

You can use the Diamond Operator like this:
```java
ArrayList<String> list = new ArrayList<String>();
```
or like this:
```java
ArrayList<String> list = new ArrayList<>();
```
This set of empty angled brackets (<>) is called the diamond operator. It causes the compiler to infer the required data type from the reference variable declaration.
