package day7;
/*
 * 
To clarify the proper use of throwing exceptions within methods and handling them in the main method, let's go through the process step by step.

Custom Exception Class
First, let's define the custom exception class InvalidAge with a constructor that takes a message:

java
Copy code
class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}
Validate Age Method
Next, we'll define the validateAge method in a class. This method will throw the InvalidAge exception if the age is less than 18.

java
Copy code
class AgeValidator {
    public void validateAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older.");
        }
    }
}
Main Method
In the main method, we will call validateAge and handle the InvalidAge exception appropriately.

java
Copy code
public class RuntimeExceptions {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(2);  // This will throw the InvalidAge exception
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());  // Print the message from the exception
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
Detailed Explanation
Custom Exception Class:

The InvalidAge class extends Exception and includes a constructor that accepts a message, which is passed to the superclass constructor.
java
Copy code
class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}
Age Validator Class:

The validateAge method checks the age. If the age is less than 18, it throws an InvalidAge exception with a specific message.
java
Copy code
class AgeValidator {
    public void validateAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("Age must be 18 or older.");
        }
    }
}
Main Method:

An instance of AgeValidator is created.
The validateAge method is called within a try block.
If an InvalidAge exception is thrown, it is caught in the catch block, and the message is printed.
The finally block is executed regardless of whether an exception is thrown or not.
java
Copy code
public class RuntimeExceptions {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(2);  // This will throw the InvalidAge exception
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());  // Print the message from the exception
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
Execution Flow
Method Call: The validateAge method is called with the argument 2.
Exception Thrown: Since 2 is less than 18, the InvalidAge exception is thrown with the message "Age must be 18 or older."
Exception Caught: The catch block catches the InvalidAge exception, and the message is printed.
Finally Block: The finally block is executed, printing "Finally block executed."
Output
scss
Copy code
Age must be 18 or older.
Finally block executed
Summary
The validateAge method is responsible for throwing the custom InvalidAge exception when the age is not valid.
The main method handles this exception using a try-catch-finally block.
The catch block prints the exception message, and the finally block ensures that cleanup code or other necessary final actions are executed.




*/
class InvalidAge extends Exception{
	InvalidAge(String m){
		super(m);
		
	}
	public void validateAge(int age) throws InvalidAge  {
		if(age>=18) {
			throw new InvalidAge("Age is less yaar");
		}
		
	}
	
}

public class RuntimeExcceptions {

	public static void main(String[] args) throws ArithmeticException,InvalidAge {
		InvalidAge i=new InvalidAge("Age is less");
		try {
			i.validateAge(2);
		}
		catch(Exception e) {
			e.getMessage();
			System.out.println("Invalid age");
			
		}
		finally {
			System.out.println("Invalid age");
		}
		
		
		

	}

	public static void m1() {
		throw new ArithmeticException("Hi this is arithmetic exception");
	}
	
}
