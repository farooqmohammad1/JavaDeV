package collectionframework;
import java.util.*;

/*Array Deque:
 * 1)Means insertion and deletion can be done at both ends
 * 2)it has method available in collection+Queue+Deque
 * 3)addFirst()[throws exception],offerFirst()
 * 4)addLast()[throws exception],offerLast()
 * 5)removeFirst()[throws exception],pollFirst()[it does not throws exception]
 * 6)removeLast()[throws exception],pollLast()[it does not throws exception]
 * Using this methods we can even use deque to implement stack(LIFO) and deque(FIFO)
 * push()->internally calls addFirst()
 * 
 * pop()->internally calls removeFisrt()
 * 
 * It maintains the insertion order
 * */

public class ArayDequ {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerFirst(30);
		System.out.println(dq);
		dq.offerFirst(40);
		System.out.println(dq);
		dq.offerLast(4);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
		
		
		

	}

}
