package typesofclassess;
import java.util.*;

/*Generics provide a way to create classes, interfaces, and methods with a placeholder for types. 
 * This allows for type-safe code and reduces the need for casting, making the code more readable and less error-prone.
 * Generics are particularly useful for creating collection classes like those in the Java Collections Framework.*/

public class GenericClasses {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(10);
		//l.add("dfg);//because we specify that it should be Integer only so erroe
		

	}

}
