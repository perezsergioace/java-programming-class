# **Chapter 1 - Introduction to Computers and Java**

## **1.1 Introduction**
Java is a powerful language that runs on practically every type of computer.

It can be used to create large applications, small programs, mobile applications, and code that powers a Web site.

## **1.2 Why Program?**
Computers can do many different jobs because they are programmable

Computers are designed to do whatever job their programs, or software, tell them to do.

## **1.3 Computer Systems: Hardware and Software**
All computer systems consist of similar hardware devices and software components.

Hardware refers to the physical components that a computer is made of.

A typical computer system consists of the following major components:
* The central processing unit (CPU)
* Main memory
* Secondary storage devices
* Input devices
* Output devices

Heart of a computer is its central processing unit, or CPU.

The CPU's job is to fetch instructions, follow the instructions, and produce some resulting data.

Internally, the central processing unit consists of two parts: the control unit and the arithmetic and logic unit (ALU).

The control unit coordinates all of the computer's operations. It is responsible for determining where to get the next instruction and regulating the other major components of the computer with control signals.

The arithmetic and logic unit is designed to perform mathematical operations.

A program is a sequence of instructions stored in the computer's memory. When a computer is running a program, the CPU is engaged in a process known formally as the fetch/decode/execute cycle.

**Fetch**: The CPU's control unit fetches, from main memory, the next instruction in the sequence of program instructions.

**Decode**: The instruction is encoded in the form of a number. The control unit decodes the instruction and generates ad electronic signal.

**Execute**: The signal is routed to the appropriate component of the computer (such as the ALU, a disk drive, or some other device). The signal causes the component to perform an operation.

Main memory commonly known as random access memory, or RAM.

Memory is divided into sections that hold an equal amount of data.

Each section is made of eight "switches" that may be either on or off.

Switch in the on position usually represents the number 1

Switch in the off position usually represents the number 0

Eight of these switches is known as a bit, which stands for binary digit.

Each section of memory, which is a collection of eight bits, is known as a byte. Each byte is assigned a unique number known as an address.

RAM is usually a volatile type of memory, used only for temporary storage.

When the computer is turned off, the contents of RAM are erased.

Secondary storage is a type of memory that can hold data for long periods of time--even when there is no power to the computer.

An operating system is a set of programs that manages the computer's hardware devices and controls their process.

Application software refers to programs that make the computer useful to the user.

## **1.4 Programming Languages**
A program is a set of instructions a computer follows in order to perform a task. A programming language is a special language used to write computer programs.

An algorithm is a set of well-defined steps for performing a task or solving a problem.

A computer's CPU can only process instructions that are written in machine language.

## **1.5 What is a Program Made Of?**
There are certain elements that are common to all programming languages.

All programming languages have some things in common.
* Key Words
* Operators
* Punctuation
* Programmer-Defined Names
* Syntax

```java
public class Payroll
{
    public static void main(String[] args)
    {
        int hours = 40;
        double grossPay, payRate = 25.0;

        grossPay = hours * payRate;
        System.out.println("Your gross pay is $" + grossPay);
    }
}
```

Key words are reserved and cannot be used for anything other than their designated purpose.

Variables are the names of memory locations that may hold data.

Semicolons do not appear at the end of every line in a Java program, however. There are rules that govern where semicolons are required and where they are not.

Part of learning Java is learning where to place semicolons and other punctuation symbols.

A variable is a named storage location in the computer's memory.

When data is stored in a variable, it is actually stored in RAM.

The Java programming statements written by the programmer are called source code, and the file they are saved in is called a source file.

After the source code is save to a file, the programmer runs the Java compiler.

A compiler is a program that translates source code into an executable form.

Syntax errors are mistakes that the programmer has made that violate the rules of the programming language.

The JVM is a program that reads Java byte code instructions and executes them as they are read.

JVM is often called an interpreter, and Java is often referred to as an interpreted language.

The term portable means that a program may be written on one type of computer and then run on a wide variety of computers, with little or no modification necessary.

Byte code is stored in a file with the .class extension.

## **1.6 The Programming Process**
The programming process consists of several steps, which include design, creation, testing, and debugging activities.

Steps to take when having trouble getting started.
1. Clearly define what the program is to do.
2. Visualize the program running on the computer.
3. Use design tools to create a model of the program.
4. Check the model for logical errors.
5. Enter the code and compile it.
6. Correct any errors found during compilation. Repeat Steps 5 and 6 as many times as necessary.
7. Run the program with test data for input.
8. Correct any running errors found while running the program. Repeat Steps 5 through 8 as many times as necessary.
9. Validate the results of the program.

The field of software engineering encompasses the whole process of crafting computer software.

It includes designing, writing, testing, debugging, documenting, modifying, and maintaining complex software development projects.

## **1.7 Object-Oriented Programming**
Java is an object-oriented programming (OOP) language. OOP is a method of software development that has its own practices, concepts, and vocabulary.

Encapsulation refers to the combining of data and code into a single object.

Data hiding refers to an object's ability to hide its data from code that is outside the object.

An object is a software entity that contains data and procedures.

The data contained in an object is known as the object's attributes.

The procedures, or behaviors, that an object performs are known as the object's methods.