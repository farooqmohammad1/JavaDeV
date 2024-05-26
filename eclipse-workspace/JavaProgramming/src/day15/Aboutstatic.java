package day15;

//static methods
class F{
	static void a() {
		System.out.println("This is F class static method");
	}
}
class H{
	void a() {
		
	}
}
class E extends F{
	static void a() {
		System.out.println("This is E");
	}
	
}

public class Aboutstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F f=new E();
		//F.a();
		//F.a();
		E.a();
		

	}

}
