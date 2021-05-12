# ☕ Java Basics Concepts

## Printing 
The print command System.out.println("Hello world"); prints the text "Hello world".
```java
System.out.println("Hello world!");
```

#### Program Boilerplate
In Java, our programs have to include some boilerplate code to function. This boilerplate, an example of which is shown below, for example tells the computer what your program is called. Below, the name of the program is Example. This name has to correspond to the name of the file that contains the source code (e.g. Example.java).
```java
public class Example {
    public static void main(String[] args) {

        System.out.println("Text to be printed");

    }
}
```
#### Printing Multiple Lines
Programs are constructed command-by-command, where each command is placed on a new line. In the example below, the command System.out.println appears twice, which means that two print commands are being executed in the program.
```java
public class Ohjelma {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("... and the universe!");
    }
}
```
#### Terminology and Code Comments
Command parameters
The information to be printed by the print command, i.e. its parameters, are passed to it by placing them inside the parentheses () that follow the command. For example, passing Hi as a parameter to the System.out.println command is done like this: System.out.println("Hi").

Semicolon Separates Commands
Commands are separated with a semicolon ;. We could, if we wanted to, write almost everything on a single line. However, that would be difficult to understand.
```java
System.out.println("Hello "); System.out.println("world"); System.out.println("!\n");
```
Sample output:
Hello
world
!

Although the previous example works, it's important to be considerate of other programmers (and your future self!) and to use line breaks. That way, anyone reading the program knows that each line does only a single concrete thing.

#### Comments
Source code can be commented to clarify it or to add notes. There are two ways to do this.

Single-line comments are marked with two slashes //. Everything following them on the same line is interpreted as a comment.
Multi-line comments are marked with a slash and an asterisk /*, and closed with an asterisk followed by a slash */. Everything between them is interpreted as a comment.
Below is an example of a program where both are used.

```java
public class Comments {
    public static void main(String[] args) {
        // Printing
        System.out.println("Text to print");
        System.out.println("More text to print!");
        /* Next:
        - more on printing
        - more practice
        - variables
        - ...
        */
        System.out.println("Some other text to print");
        // System.out.println("Trying stuff out")
    }
}
```
## Reading Input 

## Variables

## Calculating with numbers

## Conditional statements and conditional operation 

