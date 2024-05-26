package typesofclassess;

//https://www.geeksforgeeks.org/anonymous-inner-class-java/
//An inner class without  a name

//why:when we want to override the behaviour of the method without any class

/*
 * Anonymous Inner class that extends a class
Anonymous Inner class that implements an interface
Anonymous Inner class that defines inside method/constructor argument*/

/*
 * We can declare the following in anonymous classes as follows:

Fields
Extra methods (even if they do not implement any methods of the supertype)
Instance initializers
Local classes*/

/*
 * Anonymous classes also have the same restrictions as local classes with respect to their members: 

We cannot declare static initializers or member interfaces in an anonymous class.
An anonymous class can have static members provided that they are constant variables.*/
 abstract class Car{
	public abstract void breaking();
}

public class AnonymousClass {

	public static void main(String[] args) {
		Car c=new Car() {
			public void breaking() {
				System.out.println("Here breaking is invloved");
				
			}
			
		};
		//here 2 things happens
		//sub class is created name is decided by compiler
		//creates an object of subclass and assigns its reference to object
		
		//Similar for interface also works like this
		
c.breaking();
	}

}
/*
 * Anonymous classes in Java are a way to define and instantiate a class at the same time. 
 * They are used when you need to create a class that will be instantiated only once and 
 * whose type you do not need to explicitly name. They are often used for implementing interfaces or extending classes 
 * in a concise way.

Why Use Anonymous Classes?
Conciseness: They reduce the amount of boilerplate code required to create simple class implementations.
Single Use: Ideal for creating instances of objects with a one-time use, such as event handlers or comparators.
Local Scope: The class is defined and used within a method, ensuring it is not accessible from other parts of the code.
How to Use Anonymous Classes?
Anonymous classes are declared and instantiated in a single expression using the new keyword. They can be used to extend a class or implement an interface.

Example 1: Implementing an Interface


import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassExample1 {
    public static void main(String[] args) {
        // Array of strings to sort
        String[] fruits = {"Apple", "Orange", "Banana", "Pear"};

        // Using an anonymous class to implement Comparator interface
        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // Print sorted array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
Example 2: Extending a Class
java
Copy code
abstract class Animal {
    abstract void makeSound();
}

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        // Using an anonymous class to extend the Animal class
        Animal myAnimal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Woof");
            }
        };

        // Calling the method of the anonymous class
        myAnimal.makeSound(); // Output: Woof
    }
}

       

When to Use Anonymous Classes
Event Handling: Common in GUI applications for handling user actions such as button clicks.
Single-use Implementation: When you need a quick, one-time implementation of an interface or abstract class.
Inline Customization: When you want to customize the behavior of an existing class without creating a full subclass.
Summary
Anonymous classes provide a way to make your code more concise and readable by allowing you to define a class and create an instance of it at the same time. They are useful for single-use scenarios where defining a separate, named class would be overkill.

Key Points to Remember:

Declaration and Instantiation Together: Anonymous classes are declared and instantiated in one step using the new keyword.
Extending Classes or Implementing Interfaces: They can either extend a class or implement an interface.
Scope: They are typically used within a method where their usage is local to that scope.
By using anonymous classes, you can write cleaner and more maintainable code, especially for cases where you need a quick implementation of an interface or an extension of a class without the overhead of defining a new named class.






*/
 */