package overloading;

public class methodOverload {
	/*
	 * 
No, it's not possible to overload a method of a class in another class.
 Method overloading occurs within the same class when you define multiple methods with the same name but different parameters. Each class defines its own set of methods,
 and method overloading is limited to the scope of a single class.

If you have two classes and both classes have a method with the same name but different parameters,
 this is not considered method overloading; it's just a coincidence that the methods have the same name.
  Each class's methods are independent of the other class's methods, 
  and they do not interact in terms of method overloading.*/
	
	//conditions for method overload
	//1)method name should be same
	//2)number of parameters should be different
	//3)datatypes of parameters should be different
	//orders of  parameters should be different
	int a=10,b=20;
	void sum() {
		System.out.println(a+b);
	}
	//void sum(int a,int b) {
		//System.out.println(a+b);
	//}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	void sum(int a,double b) {
		System.out.println(a+b);
		
	}
	void sum(double b,int a) {
		System.out.println(a+b);
		
	}
	public static void main(int a[]) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverload sum=new methodOverload();
		sum.sum();
		//sum.sum(100,200);
		sum.sum(100,200,300);
		sum.sum(10,10.0);
		constructOverload oo=new constructOverload();
		oo.volume();

	}

}
