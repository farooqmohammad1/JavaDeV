package day15;
/*
 * If a class extends another class, it can overload methods from the superclass.
 *  When a subclass defines a method with the same name as a method in its superclass but with different parameters,
 *   it is method overloading. This is because the subclass is providing multiple versions of the method with different
 *   parameter lists,
 *  which is the essence of method overloading.*/

//Overriding 
//if a child class inherits parent class method and change its implementation then it is caled overriding
//only we can change implementation not definition
//there should be atleast two classes else no overriding
//variables also overrided
class AA{
	int a=10,b=20;
	void print() {
		System.out.println(a+b);
	}
}
class BB extends AA{
	//overiding variables and methods
	int a=1,b=2;
	void print() {  
		System.out.println(a*b);
	}
	
	//overloaded //Note within a class you can overload or inherited class we can overload
	//but if there are two classes which are not interconnected to each other then you cannot overload and override
	void print(int a,int b) {
		System.out.println(a+b);
		
	}
	
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b=new BB();
		b.print();//2
		b.print(10,200);//210
		AA a=new AA();
		a.print();//30

	}

}
