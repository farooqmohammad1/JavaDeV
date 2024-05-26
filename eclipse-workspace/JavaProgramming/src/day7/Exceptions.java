package day7;
/*
 * 1. ClassNotFoundException
This exception is thrown when an application tries to load a class through its string name but no definition
 for the class with the specified name could be found.

java
Copy code
public class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
2. NullPointerException
This exception is thrown when an application attempts to use null in a case where an object is required.


public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}
3. IOException
This exception is thrown when an I/O operation fails or is interrupted.

java
Copy code
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }
    }
}
4. InterruptedException
This exception is thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.

java
Copy code
public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        });
        thread.start();
        thread.interrupt();
    }
}
5. SQLException
This exception provides information on a database access error or other errors.

java
Copy code
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM nonexistent_table");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

        } catch (SQLException e) {
            System.out.println("SQL exception: " + e.getMessage());
        }
    }
}
Summary
ClassNotFoundException: Demonstrates handling the exception when trying to load a class that doesn't exist.
NullPointerException: Shows handling when attempting to use a null reference.
IOException: Handles file reading errors.
InterruptedException: Demonstrates handling an interrupted thread.
SQLException: Handles database access errors.
These examples cover some common scenarios where these exceptions might occur and how to handle them properly in your Java applications.









 * */

//it is an event that occurs during execution of prgm
//it cretes the exception object which contain information about the error
//runtime system use this exception object and find the class which can handle it

//https://www.geeksforgeeks.org/exceptions-in-java/
//https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

public class Exceptions {
	//unchecked exceptions
	

	public static void main(String[] args) {
		//int a=5,b=0;
		//int[] aa=new int[3];
		try {
			String str = "123";
            
	        int num = Integer.parseInt(str);
	        System.out.println("This is executed as there is no exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
		/*
   In your code, you are encountering multiple potential exceptions within a try block. 
   However, only the first exception encountered will be caught, and the execution will not proceed 
   to the next line within the try block. 
   Here is the detailed breakdown of your code:*/
		
		//try {
		//	System.out.println(a/b);
			
		//}
		
		//The catch block only handles one exception at a time.
		//Once the exception is caught and handled, the control moves to the finally block. 
		//The subsequent lines in the try block are not executed.
		//catch(Exception e){
			//System.out.println(e.getMessage());
			
			
		//}
		//finally {
			//System.out.println("Ia m always execcute");
		//}
		//try {
			//System.out.println(aa[4]);
		//}
		//catch(Exception e){
			//System.out.println(e.getMessage());
			
		//}
		
		
		       


