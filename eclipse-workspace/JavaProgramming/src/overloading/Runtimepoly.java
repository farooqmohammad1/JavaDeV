package overloading;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
	//Passing object as a parameter
    void makeSound(Animal ani) {
    	ani.makeSound();
        System.out.println("Dog barks");
    }
}
public class Runtimepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.makeSound();
		
		 // Animal myAnimal = new Dog();  // Reference of Animal type but object of Dog
	      //
		myAnimal.makeSound();         // Calls the method from Dog class
	      //  Dog myDog=new Animal();
	        /*
The statement Dog myDog = new Animal(); will result in a compilation error because it violates the principle of inheritance in Java.

In Java, you can assign an instance of a subclass to a reference variable of its superclass, but not the other way around.
 This is because the subclass object may have additional methods or behavior that are not present in the superclass.
  Assigning a superclass instance to a subclass reference would mean that you could potentially call methods on the subclass reference that do not exist in the superclass, leading to runtime errors.

To correct the error, you should assign an instance of Dog to a reference variable of type Animal, like this:

java
Copy code
Animal myDog = new Dog();
This is allowed because Dog is a subclass of Animal, and a Dog object can be treated as an Animal object due to inheritance*/

	}

}




