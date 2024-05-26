package collectionframework;
import java.util.*;
/*LinkedHashset:
 * Internally uses LinkedHashMap
 * Maintans the insertion order of element
 * not thread safe
 * 
 * */

public class LinkdHashSt {

	public static void main(String[] args) {
		Set<Integer> ls=new LinkedHashSet<>();
		ls.add(10);
		ls.add(10);
		ls.add(20);
		ls.add(4);
		ls.forEach((Integer b)->System.out.println(b));
		Iterator<Integer> aa=ls.iterator();
		while(aa.hasNext()) {
			int v=aa.next();
			System.out.println(v);
			
		}

	}

}
