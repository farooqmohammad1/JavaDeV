package day15;

final class A{
	//final int a=10;
	final void print() {
		//System.out.println();
	}
}
class B extends A{//we cannot extend a class which is declared as final
	//void print() {//we cannot override final methods  but overloading applies
		
	//}
	void print(int a) {//it is overloaded
		System.out.println("Method is overloaded if it is also");
	}
	
}

public class Finalkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		//a.a=20;//cannot change value since it is final

	}

}
