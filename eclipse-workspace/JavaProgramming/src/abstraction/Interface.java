package abstraction;
//Abstraction is the process of hiding the internal implementation and showing the functionality to the user
interface animal{
	int a=10,b=20;//by default all these are static and final
	void eat();
	
}
//an interface implements another interface
interface birds extends animal{
	
	default void parrot() {
		System.out.println("This is Parrot");
		
	}
	static void eagle() {
		System.out.println("This is eagle");
	}
	
}
class Monkey implements animal,birds{
	int c=10;
	public void eat(){
		System.out.println("We have implemented animal class");
	}
	void jump() {
		System.out.println("This belongs to Monkey");
	}
}

public class Interface {

	public static void main(String[] args) {
		Monkey m=new Monkey();
		System.out.println(m.c);
		//m.eat();
		//m.parrot();
		//m.eagle();//error we are trying to access staic method of aa interface through reference but we cant
		//birds.eagle();
		
		animal a=new Monkey();
		//System.out.println(a.c);//caannot be accessed
		//a.jump();//error because it is blong to Monkey through monkey object refrence only you can
		//m.jump();
		//a.eat();
		//a.a=20;//it is error because by default are all static and final in interface
		//System.out.println(a.a);//Although it prints through but we can print using classname.
		//The static field animal.a should be accessed in a static way
		//System.out.println(animal.a);//10
		birds b=new Monkey();
		//b.eat();
		//b.parrot();//accessing default method
		//b.eagle();//error because static methods of interface can be accesed by interface name
		//birds.eagle();
		
		

	}

}
