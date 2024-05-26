package Inheritance;

//In a single package we cannot use same class names which are used already in different file of a same package

//Multilevel Inheritance:one class extends another class and that extended class extends another class
//in above ex BB extends AA ,CC extends BB // AA is parent of BB  .BB is parent of CC
class AA{
	int a=10;
	void print() {
		System.out.println(a);
	}
}
class BB extends AA{
	int b;
	void show() {
		System.out.println(b);
		
	}
}

//now CC class having the data of AA and BB 
class CC extends BB{
	int c;
	void dis() {
		System.out.println(c);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC c=new CC();
		c.print();
		c.b=20;
		c.show();
		c.c=30;
		c.dis();

	}

}
