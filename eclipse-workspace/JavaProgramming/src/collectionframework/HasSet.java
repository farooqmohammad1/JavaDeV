package collectionframework;
import java.util.*;
/*HashSet:
 * 1)DS used:hashMap
 * 2)HashMap<E,Object> map=new HashMap<>();
 * 3)Internally add method uses put method
 * 4)only values no key value
 * 5)No gaurantee of order maintain
 * 6)It is not thread safe
 * 
 * */

public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(5);
		System.out.println(s);
		s.remove(2);
		s.forEach((Integer ii)->System.out.println(ii));
		Set<Integer> ss=new HashSet<>();
		ss.add(3);
		ss.add(4);
		//s.addAll(ss);
		//System.out.println(s);
	//	s.retainAll(ss);
		//System.out.println(s);
		//s.removeAll(ss);
		//System.out.println(s);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			int  val=i.next();
			System.out.println(val);
		}
		

	}

}
