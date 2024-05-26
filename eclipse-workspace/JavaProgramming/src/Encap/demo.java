package Encap;

public class demo {
	private int id;
	private String name;
	
	//one way of setting value
	/*void setValue(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	void getValue() {
		System.out.println(id+" "+name);
	}*/
	
	//second way
	
	demo(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void getValue() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/encapsulation-in-java/
		
		//wrapping up data into one single unit
		//1)make variables as private
		//2)for every variables we create two methods getter and setter
		//3)variables operated by methods
		
		
		//IN ENCAPSULATION WE CANNOT ACCESS VARIABLES THROUGH OBJECT REFERENCE VARIBLES ARE OPERTED ONLY BY METHODS
		//demo d=new demo();
		//d.setValue(101, "abc");
		//d.getValue();
		
		demo d=new demo(101,"abc");
		d.getValue();
		
		/*
		 * 

User
package Encapsulation;

public class Main {
	//
	private int id;
	private int acc;
	void setValue() {
		id=10111;
		acc=39029;
	}
	void getValue() {
		
		System.out.println(acc);
		}

}
package Encapsulation;

public class central {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.getValue();

	}

}
why it prints 0
ChatGPT
The Main class has instance variables id and acc that are not initialized explicitly. When you create an object of Main using Main m = new Main();, the instance variables id and acc are set to their default values, which is 0 for integers in Java.

In your Main class, you have a method setValue() that sets the values of id and acc. However, you never call this method in your central class. Hence, when you call getValue() on the Main object m, the values of id and acc remain 0 since you never set them using setValue(). That's why it prints 0.

User
solution with code
ChatGPT
To ensure that the getValue() method prints the correct value of acc, you need to call the setValue() method before calling getValue(). Here's the modified central class that does this:

java
Copy code
package Encapsulation;

public class central {

	public static void main(String[] args) {
		// Create an instance of Main
		Main m = new Main();
		
		// Set the values of id and acc
		m.setValue();
		
		// Get and print the value of acc
		m.getValue();
	}

}
With this modification, the getValue() method will print 39029, which is the value set by the setValue() method.

User
is it necessary to put put set and get 
ChatGPT
In your example, since you're directly setting and getting the values of acc within the Main class itself, the setValue() and getValue() methods are not strictly necessary. However, they can be useful in scenarios where you want to control access to the variables or perform additional logic when setting or getting the values.

If you're simply setting and getting the values without any additional logic, you can directly access the variables id and acc within the Main class. Here's an example without the setValue() and getValue() methods:

java
Copy code
package Encapsulation;

public class Main {
    private int id;
    private int acc;

    public Main() {
        id = 10111;
        acc = 39029;
    }

    public void printAcc() {
        System.out.println(acc);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.printAcc();
    }
}
In this modified example, the Main constructor sets the values of id and acc when a Main object is created. The printAcc() method then prints the value of acc. This achieves the same result as your original code but without the setValue() and getValue() methods*/
		

	}

}
