# **Lesson 4 Lab Program Notes**
Write a program that reads book price data from a file, performs some computations, and displays a table of cost data.

Input:
The file contains, on the first line, the title of the book. On the second line it contains the base price for a new copy of the book.
The rest of the file consists of lines in this format:
* Name of seller
* Shipping cost
* Quality of book (1 = new, 2 = like new, 3 = very good, 4 = good, 5 = acceptable)
If it exists and contains text, it might contain the title and base price of a new copy of the book only, or it might contain the header information and any number of complete records.
* Assume that the header information, if present, is complete.
* Assume that each record, if present, is complete.
* Assume that the correct data type for all data is in the file.

Notes for self: 
* Check/validate if the file exists. 
* Check/validate if the file contains any text. 

Output:
Display the **title** of the book and a **table** that **includes** a **header** and an output line for **each record** from the file(seller, shipping, quality) which is the **seller**, the **quality** of the book, the **cost** of the book, and the **cost** of the book **plus shipping**.

Interface:
The program should prompt for the name of the input file using the following prompt:
```java
System.out.print("What is the name of file?");
```

The program should use the following error message if the file is not found:
```java
System.out.print("The file was not found.");
```

You program should use the following message if the file is empty. (Substitute the name of the file provided by the user.):
```java
System.out.print("your_file.txt is empty.")
```

If the file contains the header record only, the program should produce the following output(header information read from the file is underlined.)
```java
System.out.print("There are no copies of Turing's Vision: The Birth of Computer Science for sale.");
```

For a file that contains a header plus seller records, output should be formatted as follows.
* Cost and Cost + Shipping will be shown with two decimal places.
* The seller column should have a width of 30 characters.
* All other columns have a width of 20 characters.

For this program, you must write (and use) the following two methods:
> calculateCost
> * calculateCost takes two parameters - the base cost of the book(double), and the quality(int)
> * calculateCost returns the adjust cost of the book(double) according to this formula:

> getQualityString
> * getQualityString takes one parameter - the quality of the book(int)
> * getQualityString returns the appropriate string(String) based on the quality (e.g. for a quality of 1, getQualityString should return "New")

