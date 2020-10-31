# **Chapter 4 Loops and Files**
## **4.1 The Increment and Decrement Operators**
++ and -- are operators that add and subtract one from their operands.
To *increment* a value means to increase it by one, and to *decrement* a value means to decrease it by one.

```java
// Both of the following statements increment the variable number:
number = number + 1;
number += 1;

// And number is decremented in both of the following statements:
number = number - 1;
number -= number;
```

Java provides a set of simple unary operators designed just for incrementing and decrementing variables.
```java
// The following statement uses the ++ operator to increment number:
number++;

// And the following statement decrements number:
number--;
```

The operators also work in *prefix mode*, where the operator is placed before the variable name as follows:
```java
++number;
--number;
```

## **4.2 The while Loop**
A loop is part of a program that repeats.
A loop is a control structure that causes a statement or group of statements to repeat.

The while loop has two important parts:
1. A boolean expression that is tested for a true or false value
2. A statement or block of statements that is repeated as long as the expression is true

Here's how the loop works:
* The BooleanExpression is tested, and if it is true, the Statement is executed.
* Then, the BooleanExpression is tested again. If its true, the Statement is executed.
* This cycle repeats until the BooleanExpression is false.
Each repetition of a loop is known as an iteration.

The while loop is known as a pretest loop, which means it tests its expression before each iteration.
An important characteristic of the while loop is that the loop will never iterate if the boolean expression is false to start with.
If you want to be sure that a while loop executes the first time, you must initialize the relevant data is such a way that the boolean expression starts out as true.

Loops must contain a way to terminate within themselves. This means that something inside the loop must eventually make the boolean expression false.
If a loop does not have a way of stopping, it is called an infinite loop as it continues to repeat until the program is interrupted.
It's also possible to create an infinite loop by accidently placing a semicolon after the first line of the while loop.
```java
int number = 1;
while (number <= 5); // This semicolon is an ERROR!
{
    System.out.println("Hello");
    number++;
}
```

## **4.3 Using the while Loop for Input Validation**
The while loop can be used to create input routines that repeat until acceptable data is entered.

*Input validation* is the process of inspecting data given to a program by the user and determining whether it is valid.

## **4.4 The do-while Loop**
The do-while loop is a posttest loop, which means its boolean expression is tested after each iteration.
The do-while loop must be terminated with a semicolon.
The do-while loop is a posttest loop. This means it does not test its boolean expression until it has completed an iteration.
As a result, the do-while loop always performs at least one iteration, even if the boolean expression is false to begin with.
You should use the do-while loop when you want to make sure the loop executes at least once.

## **4.5 The for Loop**
The for loop is ideal for performing a known number of iterations.
A loop that repeats a specific number of times is known as a count-controlled loop.

A count-controlled loop must possess three elements:
1. It must initialize a control variable to a starting value.
2. It must test the control variable by comparing it to a maximum value. When the control variable reaches its maximum value, the loop terminates.
3. It must update the control variable during each iteration. This is usually done by incrementing the variable.

In Java, the for loop is ideal for writing count-controlled loops. It is specifically designed to initialize, test, and update a loop control variable.
Here is the format of the for loop when used to repeat a single statement:
```java
for (Initialization; Test; Update)
{
    Statment;
    Statment;
    // Place as many statements here as necessay.
}
```
The first line of the for loop is known as the *loop header*.
After the key word for, there are three expressions inside the parentheses, separated by semicolons.
The first expression is the *initialization expression*. It is normally used to initialize a control variable to its starting value.
The second expression is the *test expression*. This is a boolean expression that controls the execution of the loop. As long as this expression is true, the body of the for loop will repeat.
The for loop is a pretest loop, so it evaluates the test expression before each iteration.
The third expression is the *update expression*. It executes at the end of each iteration.

Here is an example of a simple for loop that prints "Hello" five times:
```java
int count

for (count = 1; count <= 5; count++)
    System.out.println("Hello");
```
count - Because this variable keeps a count of the number of iterations, it is often called a counter variable.
It is also possible to use the control variable within the body of the loop.
For example:
```java
for (number = 1; number <= 10; number++)
    System.out.print(number + " ");

// Output: 1 2 3 4 5 6 7 8 9 10
```

Be careful not to place a statement that modifies the control variable in the body of the for loop.

Not only may the control variable be initialized in the initialization expression, but also may be declared there.
```java
for (int number = 1; number <= 10; number++)
{
    System.out.println(number + "\t\t" + number * number );
}
```
In this loop, the number variable is both declared and initialized in the initialization expression.
If the control variable is used only in the loop, it makes sense to declare it in the loop header. This makes the variable's purpose clearer.
When a variable is declared in the initialization expression of a for loop, the scope of the variable is limited to the loop. This means you cannot access the variable in statements outside the loop. 

It is possible to execute more than one statement in the initialization expression and the update expression.
When using multiple statements in either of these expressions, simply separate the statements with commas.
```java
int x, y;
for (x = 1, y = 1; x <= 5; x++)
{
    System.out.println(x + " plus " + y + " equals " + (x + y));
}
```

Don't try to connect multiple boolean expressions in the test expression, you must use the && or || operators.

## **4.6 Running Totals and Sentinel Values**
A running total is a sum of number that accumulates with each iteration of a loop.
The variable use to keep the running total is called an accumulator.
A sentinel is a value that signals when the end of a list of values has been reached.

Set the accumulator variable to 0. This is a critical step.
Each time the loop reads a number, it adds it to the accumulator.
If the accumulator starts with any value other than 0, it will not contain the correct total when the loop finishes.

A sentinel value is a special value that cannot be mistaken as a member of the list, and signals that there are no more values to be entered.
When the user enters the sentinel value, the loop terminates.

## **4.7 Nested Loops**
A loop that is inside another loop is called a nested loop.

Nested loops are necessary when a task performs a repetitive operation and that task itself must be repeated.

## **4.8 The break and continue Statements(Optional)**
The break statement causes a loop to terminate early.
The continue statement causes a loop to stop its current iteration and begin the next one.

Although it is perfectly acceptable to use the break statement in a switch statement, it is considered taboo to use it in a loop.
This is because it bypasses the normal condition that is required to terminate the loop, and it makes code difficult to understand and debug.
For this reason, you should avoid using the break statement in a loop when possible.

The continues statement should also be avoided.
Like the break statement, it bypasses the loop's logic and makes the code difficult to understand and debug.

## **4.9 Deciding Which Loop to Use**
Although most repetitive algorithms can be written with any of the three types of loops, each works best in different situations.
* **The while loop**. The while loop is a pretest loop. It is ideal in situations where you do not want the loop to iterate if the condition is false from the beginning. It is also ideal if you want to use a sentinel value to terminate the loop.
* **The do-while loop**. The do-while loop is a posttest loop. It is ideal in situations where you always want the loop to iterate at least once.
* **The for loop**. The for loop is a pretest loop that has built-in expressions for initializing, testing, and updating. These expressions make it very convenient to use a loop control variable as a counter. The for loop is ideal in situations where the exact number of iterations is known.

## **4.10 Introduction to File Input and Output**
The Java API provides several classes that you can use for writing data to a file and reading data from a file.
To write data to a file, you can use the PrintWriter class and, optionally, the FileWriter class.
To read data from a file, you can use the Scanner class and the File class.

To retain data between the times it runs, a program must have a way of saving the data.

An input file is a file that a program reads data from. It is called an input file because the data stored in it serves as input to the program.
An output file is a file that a program writes data to. It is called an output file because the program stores output in the file.

There are two types of files: text and binary.
A text file contains data that has been encoded as text, using a scheme such as Unicode.
Even if the file contains numbers, those numbers are stored in the file as a series of characters. As a result, the file may be opened and viewed in a text editor such as Notepad.
A binary file contains data that has not been converted to text.

The Java API provides a number of classes that you will use to work with files. To use these classes, you will place the following import statement near the top of the program. 
```java
import java.io.*;
```

To write data to a file create an instance of the PrintWriter class. The PrintWriter class allows you to open a file for writing.
You pass the name of the file that you wish to open, as a string, to the PrintWriter class's constructor.
```java
PrintWriter output file = new PrintWriter("Student.txt");
```

You may also pass a reference to a String object as an argument to the PrintWriter constructor.
```java
String filename;
filename = JOptionPane.showInputDialog("Enter the filename");
PrintWriter outputFile = new PrintWriter(filename);
```
**Warning**: If the file that you are opening with the PrintWriter object already exists, it will be erased and an empty file by the same name will be created.

You can write data to the file using the print and println methods.
```java
outputFile.println("Jim");
```

When the program is finished writing data to the file, it must close the file.
To close the file use the PrintWriter class's close method.
```java
outputFile.close();
```

A buffer is a small "holding section" of memory.

Once a file is closed, the connection between it and the PrintWriter object is removed. In order to perform further operations on the file, it must be opened again.

A delimiter is an item that separates other items.

Because we have not yet learned how to respond to exceptions, any method that uses a PrintWriter object must have a throws IOException clause in its header.

Appending to a file means writing new data to the end of the data that already exists in the file.

To append data to an existing file, you first create an instance of the FileWrite class.
You pass two arguments to the FileWriter constructor: a string containing the name of the file, and the boolean variable true.
Here is an example:
```java
FileWriter fwriter = new FileWriter("MyFriends.txt", true);
```
You still need to create a PrintWriter object so you can use the print and println methods to write to the file.
```java
FileWriter fwriter = new FileWriter("MyFriends.txt", true);
PrintWriter outputFile = new PrintWriter(fwriter);
```

**Specifying the File Location**
When you open a file you may specify its path along with its filename.

**Reading Data from a file**
You can also use the Scanner class to read input from a file. Instead of passing System.in to the Scanner class constructor, you pass a reference to a File object. Here is an example:
```java
File myFile = new File("Customers.txt");
Scanner inputFile = new Scanner(myFile);
```

After you create a File object representing the file that you want to open, you can use the File class's **exists** method to determine whether file exists.
The method returns true if the file exists, or false if the file does not exist.
```java
import java.util.Scanner;
import java.io.*;

/**
 * This verson of the program confirms that the Numbers.txt file exists before opening it.
 */

public class FileSum2
{
    public sttic void main(String[] args) throws IOException
    {
        double sum = 0.0;

        // Make sure the file exists.
        File file = new File("Numbers.txt");
        if (!file.exists())
        {
            System.out.println("The file Numbers.txt is not found.");
            System.exit(0);
        }
    }
}
```
