package Inheritance;

//Hierarchical Inheritance::one parent class can have multiple child classes but child classes are not related
class Parent{
	int a;
	void display() {
		System.out.println(a);
	}
	
}

//child 1 contains display and print methods and a ,b varibles
class child1 extends Parent{
	int b;
	void print() {
		System.out.println(b);
	}
}

//child 2 contains display and show methods and a ,c variables
class child2 extends Parent{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.a=10;
		c1.b=20;
		c1.print();
		c1.display();
		child2 c2=new child2();
		c2.a=30;
		c2.c=40;
		c2.display();
		c2.show();
		
		
		

	}

}
