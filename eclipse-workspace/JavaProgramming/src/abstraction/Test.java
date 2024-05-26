package abstraction;

//Yes, in Java, you can only have one public class per file. The file name must match the name of the public class. 
//However, you can have multiple non-public (package-private or protected) classes in the same file.
 abstract class Car{
	int mileage;
	Car(int mileage){
		this.mileage=mileage;
	}
	public abstract void pressBreak();
}
 abstract class Luxury extends Car{

	Luxury(int mileage) {
		super(mileage);
		// TODO Auto-generated constructor stub
	}
	public void pressBreak() {
		System.out.println("hi"+mileage);
	}
	
}
class S extends Luxury{

	S(int mileage) {
		super(mileage);
		
		// TODO Auto-generated constructor stub
	}
	
}
public class Test {

	public static void main(String[] args) {
		S s=new S(5);
		s.pressBreak();
		//Object o=new S(5);
		//o.getClass();
		
		
		
	}

}
