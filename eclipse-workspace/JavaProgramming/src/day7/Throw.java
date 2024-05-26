package day7;
public class Person {
    private String name;
    private int age;

    // No-argument constructor
    public Person() {}

    // Constructor with arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {

    	return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{names='" + name + "', ages=" + age + '}';
    }
}


public class Throw {

	public static void main(String[] args)
	throws ArithmeticException{
		
		 Person person1 = new Person();
	        person1.setName("John Doe");
	        person1.setAge(30);

	        // Creating a Person object using the constructor with arguments
	        Person person2 = new Person("Jane Doe", 25);

	        // Accessing the fields using getter methods
	        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");

	        // Printing the person objects using the overridden toString method
	        System.out.println(person1);
	        System.out.println(person2);
	    }
	
	/*Summary
	Encapsulation: POJOs encapsulate data through private fields and public getter and setter methods.
	Flexibility: POJOs can extend other classes and implement interfaces, but they do not enforce any specific inheritance or interface requirements.
	Simplicity: They avoid dependencies on specific frameworks or APIs, making them lightweight and versatile.
	Use Cases: POJOs are commonly used for representing data objects in applications, especially in frameworks like Hibernate, Spring, and others where data mapping and transfer are essential.
	While POJOs focus on simplicity and flexibility, they are not restricted from using inheritance or implementing interfaces when necessary. The primary goal of a POJO is to remain a straightforward, easy-to-use object that encapsulates data without imposing heavy restrictions or dependencies.
*/





	//The @Override annotation indicates that the method is overriding the toString method from the Object class. While not strictly necessary, it's good practice to use this annotation to avoid accidental method signature changes.
	//The method body returns a string that represents the Person object's state. In this case, it includes the name and age fields of the Person object. The format is "Person{name='[name]', age=[age]}", where [name] and [age] are replaced with the actual values of the name and age fields, respectively.
	//When you call toString on a Person object, it will return a string like "Person{name='John Doe', age=30}", assuming the name field is "John Doe" and the age field is 30. This can be useful for debugging or logging purposes, as it provides a human-readable representation of the object's state.








		
	}


