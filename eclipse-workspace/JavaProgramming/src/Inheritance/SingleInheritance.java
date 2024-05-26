package Inheritance;

//one parent having one child means in single inheritance there is only one parent and one child
//in one java file there will be one class(main class) that have public access modifier remaining should have not have public access modifier

class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
	
}
class B extends A{
	int b=20;
	void show() {
		System.out.println(b);
		
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		//creating object for B class
		
		B bobj=new B();
		//As B extends A the variables and methods of A is inherited by B,
		So inorder to access the class A Data  we need not to create separate object for A ,simply create objct for B ,
		through B we can access A also//
		bobj.a=10000;
		bobj.display();
		
		bobj.show();

	}

}
