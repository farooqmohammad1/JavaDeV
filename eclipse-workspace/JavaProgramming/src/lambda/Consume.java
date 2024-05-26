package lambda;
import java.util.function.Consumer;

//this functional interface take one input parameter and does not return anything
//it has accept() method

public class Consume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> i=(ii)->System.out.println("This is a cconsumer method");
		i.accept(10);
		
		
		

	}

}
