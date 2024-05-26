package lambda;
import java.util.function.Supplier;

//this fI does not accept any parameter but return some value

public class Supplir {

	public static void main(String[] args) {
		
		Supplier<String> ss=()->{return "Hi";};
		String val=ss.get();
		System.out.println(val);
		

	}

}
