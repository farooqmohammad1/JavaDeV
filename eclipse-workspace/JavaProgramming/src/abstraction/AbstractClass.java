package abstraction;
//https://www.geeksforgeeks.org/abstract-classes-in-java/

abstract class K{
	abstract void a1();
	abstract void a2();
}
abstract class L extends K{
	void a1() {
		System.out.println("This is A1");
	}
}
class M extends L{
	void a2() {
		System.out.println("This is A2");
	}
}
abstract class  A{
	abstract void m1();
	void m2() {
		System.out.println("This is from A class");
		
	}
	static void f() {
		System.out.println("This is static method of class A");
	}
	
	
}
abstract class B extends A{
	void m1() {
		System.out.println("This is m1 by B");
	}
	void m2() {
		System.out.println("This is overriden method");
	}
}
class C extends B{
	
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C c =new C();
		//A a=new C();
		//a.m2();
		
		//c.m1();
		//A.f();
		M m=new M();
		m.a1();
		m.a2();
		
		
		
		

	}

}
