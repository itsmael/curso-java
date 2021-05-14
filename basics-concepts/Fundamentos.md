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
Input refers to text written by the user read by the program. Input is always read as a string. For reading input, we use the Scanner tool that comes with Java. The tool can be imported for use in a program by adding the command import java.util.Scanner; before the beginning of the main program's frame (public class ...). The tool itself is created with Scanner scanner = new Scanner(System.in);.

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We can now use the scanner tool.
        // This tool is used to read input.
    }
}
```
Below is an example of a program which asks for user input, reads the string entered by the user, and then prints it.
```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Print "Write a message: "
        System.out.println("Type your user name: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println(message);
    }
}

```

### Fundamentals of Strings
As you might have noticed, in programming we refer to "strings" rather than "text". The term "string" is shorthand for "string of characters" which describes how the computer sees text on a more fundamental level: as a sequence of individual characters (char).

We've so far used strings in two ways. When practicing the print command, we passed the string to be printed to the print command in quotation marks, and when practicing reading input, we saved the string we read to a variable.

In practice, variables are named containers that contain information of some specified type and have a name. A string variable is declared in a program by stating the type of the variable (String) and its name (myString, for instance). Typically a variable is also assigned a value during its declaration. You can assign a value by following the declaration with an equals sign followed by the value and a semicolon.

A string variable called message that is assigned the value "Hello world!" is declared like this:
```java 
String message = "Hello world!";
```
When a variable is created, a specific container is made available within the program, the contents of which can later be referenced. Variables are referenced by their name.
```java 
String message = "Hello world!";
System.out.println(message);
```
### Concatenation 
You can join multiple strings using the + operator. Like :
```java
public class Program {

    public static void main(String[] args) {
        System.out.println("Hello " + "world!");
    }
}
```
Also you can join a variable with a string:
```java
public class Program {

    public static void main(String[] args) {
        String message = "Hello world!";

        System.out.println(message + " ... and the universe!");
    }
}
```
### Reading Strings 
The **reader.nextLine();** command reads the user's input and returns a string. If we then want to use the string in the program, it must be saved to a string variable — String message = scanner.nextLine();. A value saved to a variable can be used repeatedly. In the example below, the user input is printed twice.
```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Create the tool for reading, assign it to variable caller "scanner
        Scanner scanner = new Scanner(System.in);

        //Print user a message "Write a message: "
        System.out.println("Write a message: ");

        //Read the user's string input, save it to program memory
        //"String message = (user input)"
        String message = scanner.nextLine();

        // Print the user input twice
        System.out.println(message);
        System.out.println(message);
    }
}
```
### Input String as a Part of Ouput 
Using the same concept of concatenation we can input string as a part of output like the example below:
```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");

        String message = scanner.nextLine();

        System.out.println("You wrote " + message);
    }
}
```


## Variables

## Calculating with numbers

## Conditional statements and conditional operation 

