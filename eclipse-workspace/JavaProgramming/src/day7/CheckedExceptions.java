package day7;

public class CheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Checked exceptions in Java are exceptions that are checked at compile-time.
		 *  They are typically external conditions that a program cannot handle directly, such as file not found,
		 *   network issues, or other I/O errors. Because these exceptions are anticipated by the programmer, Java requires that they be either caught in a try-catch block or declared in the method signature using the throws keyword.

Key Points
Checked Exceptions: Subclasses of Exception (except for RuntimeException and its subclasses).
Compile-Time Checking: The compiler checks that checked exceptions are properly handled.
Common Examples: IOException, SQLException, ClassNotFoundException.
Example of Checked Exception: File I/O
Let's go through a detailed example using file I/O operations, which often throw checked exceptions like IOException.

Step 1: Import Required Classes
java
Copy code
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
Step 2: Define a Method that Reads a File
The method will declare that it throws IOException.

java
Copy code
public class FileReadExample {
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
Step 3: Call the Method and Handle the Exception
The main method will call readFile and handle the IOException.

java
Copy code
public class Main {
    public static void main(String[] args) {
        try {
            FileReadExample.readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
Complete Code
java
Copy code
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReadExample {
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            FileReadExample.readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
Explanation
Importing Required Classes:

BufferedReader and FileReader are used for reading from a file.
IOException is the checked exception that these classes may throw.
Method with Throws Clause:

The readFile method reads the contents of a file line by line.
It declares throws IOException, indicating that it might throw this exception, and the caller must handle it.
Handling the Exception in Main:

The main method calls readFile inside a try block.
If readFile throws an IOException, it is caught in the catch block.
The finally block ensures that a message is printed regardless of whether an exception occurs.
Output (if the file exists and contains lines):
arduino
Copy code
First line of the file
Second line of the file
...
Execution completed.
Output (if the file does not exist):
go
Copy code
An error occurred: example.txt (No such file or directory)
Execution completed.
Summary
Checked Exceptions: Must be either caught or declared in the method signature.
Throws Clause: Used to declare that a method can throw one or more checked exceptions.
Try-Catch-Finally: Used to handle exceptions and ensure that certain code executes regardless of whether 
an exception occurs.
Common Usage: File I/O, database access, network communication, etc.
Using checked exceptions ensures that the programmer anticipates and handles potential error conditions,
 leading to more robust and error-resilient code.








*/

	}

}
