package typesofclassess;
//static inner classes
//
//It do not have access to non static instance variables and method of outer class.
//Its object is instantiated without instantiating the object of fouter class
//it can public,private,protected
//class Outerclass{
	//int  a=10;
	//static int classVariable=78;
	//static class NestedClass{
	//	public void print() {
		//	System.out.println("Hi this is nested static class method"+classVariable+" ");//a got error because we cannot
			//access only we can static variables and methods
			
		//}
	//}
	
//}
//Nested class can be public private protected 
class Outerpublic{
	int a=10;
	static int classVariable=78;
	private static class NestedClass{
		public void print() {
			System.out.println("Hi this is nested static class method"+classVariable+" ");
	
}
	}
	/*
In the given code, an instance of the nested class NestedClass is indeed created, but it is done within the display method of the Outerpublic class, not directly in the main method. This approach encapsulates the creation and usage of the nested class within the Outerpublic class, ensuring that the nested class remains hidden from the outside world, which is a good practice in terms of encapsulation and data hiding.

Here’s a step-by-step explanation of how your code works:

Outerpublic Class:

Contains an instance variable a and a static variable classVariable.
Defines a private static nested class NestedClass with a method print that prints the static variable classVariable.
Has a public method display that creates an instance of NestedClass and calls its print method.
StaticClass Class:

Contains the main method.
Creates an instance of Outerpublic.
Calls the display method on the Outerpublic instance, which in turn creates an instance of NestedClass and calls its print method.
Here’s your code with some comments for clarity:



  
Explanation of Why Object Is Not Created in Main
Encapsulation: The nested class NestedClass is private, meaning it cannot be accessed directly from outside the Outerpublic class. This enforces encapsulation.
Indirect Access: The display method in Outerpublic provides an indirect way to access the functionality of NestedClass. When you call o.display() in the main method, it handles the creation of the NestedClass instance and the call to its print method.
*/
	public void display(){
		NestedClass n=new NestedClass();
		n.print();
		
	}
}

public class StaticClass {

	public static void main(String[] args) {
		
		Outerpublic o=new Outerpublic();
		o.display();
		
		
		//Outerclass.NestedClass a=new Outerclass.NestedClass();
		//a.print();
		/*
In Java, when you refer to a static nested class from outside its outer class, you need to qualify it with the outer class name. This is because the nested class is logically a member of the outer class, and its name is scoped within the outer class.

Why Outerclass.NestedClass nestedObject = new Outerclass.NestedClass(); Works
When you use Outerclass.NestedClass nestedObject = new Outerclass.NestedClass();, you are specifying the full path to the NestedClass. This tells the compiler exactly where to find NestedClass.

Why Outerclass.NestedClass nestedObject = new NestedClass(); Does Not Work
When you use Outerclass.NestedClass nestedObject = new NestedClass();, the compiler does not know where to find NestedClass because it is scoped within Outerclass. NestedClass by itself is not a top-level class, so it must be qualified with the outer class name.

Example Code*/
		

	}

}
