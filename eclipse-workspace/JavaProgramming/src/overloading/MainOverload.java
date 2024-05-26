package overloading;

public class MainOverload {
	void main(int x) {
		
		System.out.println(x);
	}
	void main(String s) {
		System.out.println(s);
		
	}
	void main(String a,String b) {
		System.out.println(a+b);
		
	}
	

	public static void main(String[] args)//here args is just a parameter we can use a ,b, ...
	{
		// TODO Auto-generated method stub
		
		MainOverload m=new MainOverload();
		m.main(1);
		m.main("a");
		m.main("a","b");

	}

}
