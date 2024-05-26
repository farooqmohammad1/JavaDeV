package day5;

//static keyword can be applied for keywords and methods

public class Static {
	int id;
	String name;
	static String dept="ABC";
	
	public static void m1() {
		System.out.println("Hi this is a static method");
	}
	//non-static methods can access everything directly
	void m2() {
		System.out.println("This is a non-static method");
		m1();
		System.out.println(dept);
	}

	public static void main(String[] args) {
	     //https://www.geeksforgeeks.org/static-keyword-java/
		
		//static methods can access static stuff directly no need to create object
		
		//System.out.println(dept);
		//m1();
		//m2();
		//cannot accesss non static method without creating object
		//Static s=new Static();
		//s.m2();
		Static.dept.length();//like that we can apply methods
		
		//class System{
		//static PrintStream out;}
		
		//access:System.out.println(); 
		
		
		
		
		
		
		
		

	}

}
