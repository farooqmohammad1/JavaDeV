package day6;
import day6.day61.*;//if there are multiple classes then *

public class Accessmodifiers  {

	public static void main(String[] args) {
		//access modifiers-->defines the scope of variables and methods
		//private--private methods and variables are only accessed only within the class
		//default--we can access within the same package
		//protected--we can access outside the package also but through inheritance only(first import and inherit)
		//public--Everywhere we can access directly
		
		Accessmodifiers a=new Accessmodifiers();
		//a.m2();
		//Accessmodi2 b=new Accessmodifiers();
		//b.m2();//not possible
		a.m3();
		
		
		
	}

}
