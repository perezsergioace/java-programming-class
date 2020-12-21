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

As with any other type of object, it is possilbe to declare a refereence variable and create an instance of an array with one statement.
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
