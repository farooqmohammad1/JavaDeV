package Day3;
import Day2.functions;

public class Main {
	int sno;
	String sname;
	double marks;
	void showData() {
		System.out.println(sno+" "+sname+" "+marks);
	}
	//void studentData(int sn,String snam,double mark) {
      // sno=sn;
       //sname=snam;
       //marks=mark;
	//}
	Main(int sn,String snam,double mark){
		sno=sn;
		sname=snam;
		marks=mark;
	}

	public static void main(String[] args) {
		// in this we will discuss about the ways to store data into class variables
		/*
		 * 
In the statement Main stu = new Main();, the class name Main appears on both the left side and the right side of the assignment operator =. However, they are used in different contexts:

Left side (Main stu): Here, Main is used as the type of the variable stu. It declares stu as a variable that can refer to objects of the Main class.
Right side (new Main()): Here, Main is used as the class name to create a new instance of the Main class using the new keyword. This creates a new object of the Main class and initializes it.
So, while the class name Main appears on both sides, they serve different purposes in the statement. The left side is for declaring the type of the variable, and the right side is for creating a new instance of the class.*/
		//1st method: using object reference variables
		//Main stu=new Main();
		//stu.sno=101;
		//stu.sname="ABC";
		//stu.marks=489;
		//stu.showData();
		
		//2nd method through methods
		//Main  stu=new Main();
		//stu.studentData(101,"ABC",456);
		//stu.showData();
		
		
		Main stu=new Main(101,"ABC",4567);
		stu.showData();
		

	}

}
