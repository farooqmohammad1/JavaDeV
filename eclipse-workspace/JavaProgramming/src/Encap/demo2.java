package Encap;

public class demo2 {
	int id;
	static String dept="ABC";
	
	void set(int id) {
		this.id=id;
		
	}
	void get() {
		System.out.println(id+" "+dept);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 d=new demo2();
		demo2 d1=new demo2();
		demo2 d2=new demo2();
		
		d.get();//ABC
		d1.dept="BCA";
		d1.get();//BCA
		d2.get();//BCA
		 
		
		
		
		

	}

}
