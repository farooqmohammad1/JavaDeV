package Day2;

public class functions {
	//types of functions
	//1) no params  no return value
	  public void m1() {
		System.out.println("hi");
	}
	
	//2) no params return value
	public String m2() {
		return "Hello";
	}

	
	//3)takes params no return value
	
	public void m3(String name) {
		System.out.println("Hi"+name);
	}
	
	//4)takes params return value
	
	public String m4(String name) {
		return "Hello +name";
		
	}
}
