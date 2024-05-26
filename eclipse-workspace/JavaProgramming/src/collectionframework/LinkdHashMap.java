package collectionframework;
import java.util.*;


//LinkedHashMap:
//Helps in maintain insertion order   Similar to HashMap it uses Doubly LinkedList

public class LinkdHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mm=new LinkedHashMap<>();
		  mm.put(1,"a");
	      mm.put(2,"b");
	      mm.put(3,"c");
	      mm.forEach((Integer key,String value)->System.out.println(key+":"+value));
	      for(Map.Entry<Integer,String> aa:mm.entrySet()) {
	    	  System.out.println(aa.getValue());
	      }
   

	}

}
