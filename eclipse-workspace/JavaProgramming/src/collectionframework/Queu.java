package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queu {

	public static void main(String[] args) {
		
		//First in first out
		/*: A PriorityQueue in Java is implemented as a min-heap. This means the smallest element is always at the head of the queue.
		 *  However, the internal structure of the heap does not guarantee a sorted order of the remaining elements.*/
		//Queue<Integer> q=new PriorityQueue<>((Integer o1,Integer o2)->o2-o1);//for descending
		
		//It does not maintain insertion order-
		
		//Queue<Integer> q=new PriorityQueue<>((Integer o1,Integer o2)->o2-o1);//for descending
		PriorityQueue<Integer> q=new PriorityQueue<>();//default
		
		q.offer(10);
		q.offer(20);
		q.offer(1);
		System.out.println(q);
		q.offer(2);
		System.out.println(q);
		q.offer(0);
		System.out.println(q.poll());
		//poll()->It retrives and deletes the element at the head
		System.out.println(q.peek());
		//peek()->retrives the elemnt at head
		System.out.println(q);
		q.offer(11);
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.size());
		

	}

}
