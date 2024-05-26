package lambda;

@FunctionalInterface
interface car{
	 void bookCar();
}
class Ola implements car{
	public void bookCar() {
		System.out.println("This is ola");
	}
	
}
interface Cab{
	void bookCab(String source,String dest); 
		
	
}
interface bike{
	String book(String from,String to);
}


public class Lambda1 {

	public static void main(String[] args) {
		//car c=()->System.out.println("ola is");//Lambda
		//c.bookCar();
		//Cab cb=(String source,String dest)->System.out.println(source+dest);
		//cb.bookCab("Hyd", "Mum");
		
		bike b=(String from,String to)->{
			System.out.println(from+" "+to);
			return ("This iss return to");
		};
		System.out.println(b.book("Mar","Hos"));
		

	}

}
