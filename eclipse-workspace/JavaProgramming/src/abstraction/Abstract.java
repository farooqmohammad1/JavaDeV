package abstraction;

abstract class Demo{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	
	
	
}
abstract  class demo  extends Demo{
	public void m1() {
		System.out.println("This is called");
	}
}

//if a concrete class extends abstarct class then it should implement all the methods of that abstract class else get error
//if a abstract class extends another abstract class then it can implement all the methods or not no issues 
//but if a normal class implemets abstract class then it should implement all the methods of a abstract class
class semo extends demo{
	public void m1() {
		
	}
	public void m2() {
		
	}
	public void m3() {
		
	}
	
}

//If the Child class is unable to provide implementation to all abstract methods of the Parent class 
//then we should declare that Child class as abstract so that the next level Child class should provide implementation
//to the remaining abstract method

//abstract class BBB{
	// declaring inner class as abstract with abstract
    // method
	//abstract class AAA{
		//abstract void myAbstract();
	//}
//}
//class CCC extends BBB{
	//void myAbstract() {
		//System.out.println("Implementing the  functionality");
	///}
//}

//Java Program to Illustrate Abstract classes
//Can also have Final Methods

//Class 1
//Abstract class
//abstract class Base {

// final void fun()
 //{
  //   System.out.println("Base fun() called");
 //}
//}
//class derived extends Base{
	
//}

//abstract class Z{
	//void m() {
		//System.out.println("This is concrete method");
	//}
//}
//class Y extends Z{
	// This class only inherits the Z class methods and
    // properties
//}


//Abstract class
//abstract class Sunstar {
// abstract void printInfo();
// Sunstar(){
//	 System.out.println("Abstract class can have constructors");
 //}
 //Sunstar(int a){
	// System.out.println("parameterized constructor"+a);
 //}
//}

//Abstraction performed using extends
//class Employee extends Sunstar {
 //void printInfo()
 //{
     //String name = "avinash";
    // int age = 21;
    // float salary = 222.2F;

     //System.out.println(name);
     //System.out.println(name);
    // System.out.println(age);
    // System.out.println(salary);
 //}
//}
public class Abstract {

	public static void main(String[] args) {
		//Sunstar s=new Employee();
		
		//Employee e=new Employee();
		//e.printInfo();
		//Y y=new Y();
		//y.m();
	//	Base b=new derived();
		//b.fun();
		//D d=new D();
		//D.E e=d.new E();
		//e.myAbstractMethod();
		//CCC c=new CCC();
		//c.myAbstract();
		semo s=new semo();
		s.m1();
		s.m2();
		s.m3();
		
		
		
		
		
		

	}

}
