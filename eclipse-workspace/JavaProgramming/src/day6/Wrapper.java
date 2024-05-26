package day6;
import day6.day61.*;

//https://www.geeksforgeeks.org/wrapper-classes-java/

public class Wrapper {

	public static void main(String[] args) {
	 Accessmodi2 w=new Accessmodi2();
	 w.m3();//accessing another package method since it is public
		
		/*
		 * Boxing: The process of converting a primitive data type into its corresponding wrapper class object.

Example: Converting an int to an Integer.

int primitiveInt = 5;
Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing*/
		
		/*
		 * Unboxing: The process of converting a wrapper class object back to its corresponding primitive data type.

Example: Converting an Integer to an int.

Integer wrappedInt = Integer.valueOf(5);
int primitiveInt = wrappedInt.intValue(); // Unboxing*/
		
		/*
		 * Autoboxing: Automatic conversion of a primitive data type into its corresponding wrapper class object.


int primitiveInt = 5;
Integer wrappedInt = primitiveInt; // Autoboxing*/
		
		/*
		 * Auto-unboxing: Automatic conversion of a wrapper class object back to its corresponding primitive data type.


Integer wrappedInt = 5; // Autoboxing
int primitiveInt = wrappedInt; // Auto-unboxing*/
		
		//String to int,double.boolean but char is not possile because string is  acollection of char and char is a single character
		//non-primitive to primitive
		String p1="177";
		String p2="true";
//int a=Integer.parseInt(p1);
		double d=Double.parseDouble(p1);
		boolean b=Boolean.parseBoolean(p1);
//System.out.println(a+" "+d+" "+b);//177  177.0 false  when we give value otherthan true then it will take as false
		
		boolean b1=Boolean.parseBoolean(p2);
		System.out.println(b1);//true
		String s="false";
		
		//primitive to non-primitive
		int a=10;
		Integer aa= Integer.valueOf(a);
		System.out.println(aa);//printitng the integer object
		//the valueOf() method returns the string representaion of specified value
		
		//the toString() method returns the string itsself
		
		//METHOD TO CONVERT ALL PRIMITIVE TYPE TO STRING  valueOf()
		
		int z=10;
		double y=10.5;
		char ch='A';
		boolean bool=true;
		
		String ss=String.valueOf(bool);
		
		String zz=String.valueOf(y);
		System.out.println(zz+7);
		System.out.println(ss);
		
		
		
		
/*
int primitiveInt = 5;
Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing
System.out.println(wrappedInt+5);*/
		
				

	}

}



/*
Examples
Using Collections:

Collections, such as ArrayList, cannot store primitive types directly. Autoboxing and auto-unboxing enable you to store and retrieve primitive values in collections without manual conversion.
java
Copy code
ArrayList<Integer> list = new ArrayList<>();
list.add(10); // Autoboxing
int num = list.get(0); // Auto-unboxing
Arithmetic Operations:

Autoboxing and auto-unboxing allow arithmetic operations to be performed directly on wrapper objects.
java
Copy code
Integer a = 10;
Integer b = 20;
Integer sum = a + b; // Auto-unboxing of a and b, then autoboxing of the result
Method Calls:

Methods expecting wrapper types can be called with primitive values, and vice versa.
java
Copy code
public void printInteger(Integer i) {
    System.out.println(i);
}

printInteger(100); // Autoboxing
Important Points
Performance: While autoboxing and auto-unboxing simplify code, 
they can introduce performance overhead due to the creation and destruction of wrapper objects. 
In performance-critical applications, consider the impact of this overhead.
Null Handling: Auto-unboxing a null reference will throw a NullPointerException.
 Be cautious when dealing with wrapper types that might be null.
 
 
Integer wrappedInt = null;
int primitiveInt = wrappedInt; // Throws NullPointerException

By understanding and using autoboxing and auto-unboxing, you can write cleaner and more concise Java code,
 especially when dealing with collections and APIs that operate on object types.






*/
