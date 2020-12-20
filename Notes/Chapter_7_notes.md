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
