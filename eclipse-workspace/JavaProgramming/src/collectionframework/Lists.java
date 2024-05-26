package collectionframework;
import java.util.*;


public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.size());
		//List methods
		System.out.println(l.get(0));
		System.out.println(l.set(0, 200));
		System.out.println(l);
		System.out.println(l.set(1, 300));
		System.out.println(l);
		System.out.println(l.contains(100));
		//System.out.println(l.indexOf(100));
		//System.out.println(l.subList(2,3));
	//	System.out.println(l.remove(Integer.valueOf(20)));
		
		for(Integer i:l) {
			System.out.println(i);
		}
		Iterator i= l.iterator();
		//iterator() is a method of collection which returns an Iterator instance
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
