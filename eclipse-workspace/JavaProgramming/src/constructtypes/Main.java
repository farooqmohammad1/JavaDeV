package constructtypes;


public class Main{
	int a,b;
	Main()//default constructor
	{
		 a=100;
		 b=200;
	}
	Main(int x,int y)   //parameterized constructor
	{
		a=x;
		b=y;
	}
	void sum() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main sum=new Main();//invoke default constructor 
		//Main sum=new Main(10,20);
		//sum.sum();
		sum.sum();
		
		

	}

}