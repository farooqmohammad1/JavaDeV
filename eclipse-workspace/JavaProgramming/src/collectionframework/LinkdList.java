package collectionframework;
import java.util.*;

/*
 * LinkedList:
 * It implements both Deque and List Interface */

public class LinkdList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		ll.offerFirst(10);
		ll.offerFirst(20);
		ll.offerFirst(30);
		ll.addAll(1,al);
		al.sort(null);
		System.out.println(ll);
		ll.offer(40);//internally offer last
		System.out.println(ll);
		ll.poll();//internally poll first
		System.out.println(ll);
		//ll.forEach( i->System.out.println(i));
		

	}

}
