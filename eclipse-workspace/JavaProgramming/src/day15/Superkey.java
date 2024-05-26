package day15;

//super keyword
//It always invokes immediate parent class
//Only used in Inheritance
//invokes immediate parent class variable
//invokes immediate parent class method

//it is not used in interfaces as it invokes immediate parent class //applicable for only classes
class AAA{
	int a=10;
	void show() {
		System.out.println("Value is 10");
	}
	static void dis() {
		System.out.println("This is a static method");
		
	}
}
class p{
	void show() {
		
	}
}
class BBB extends AAA{
	//we cannot override the static methods
	/*
     void dis(){
		
}*/
	void dis(int a) {
		 
	}
	

/*
class BBB extends AAA{
	int a=100;
	void show() {
		System.out.println(a);//100
		System.out.println(super.a);//10 as it invokes parent class value
		super.show();//invokes immediate parent class
	}
	
}
*/
/*
class CCC  extends BBB{
	void show() {
		super.show();//invokes BBB class methods
	}*/
//class CCC extends AAA {
	//void show() {
		//super.show();//invokes its parent AAA method
	}

//}

public class Superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BBB b=new BBB();
		//b.show();
		//CCC  c=new CCC();
	//c.show();
		
		AAA a=new AA();
		

	}

}
