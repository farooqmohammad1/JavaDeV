import java.util.*;

public class pririty_queue {
    public static void main(String[] args) {
        //A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

        //The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
       // PriorityQueue<Integer> pq=new PriorityQueue<>();
       // pq.offer(3);
       // pq.offer(1);
       // pq.offer(2);
       // System.out.println(pq);
       // pq.offer(0);
       // System.out.println(pq);
       // pq.offer(-1);
       // System.out.println(pq);
       // System.out.println(pq.peek());
       // for(Integer p:pq){
       //     System.out.print(p+" ");
       // }

       //System.out.println(pq.size());
       //System.out.println(pq.contains(1));
       //System.out.println(pq.isEmpty());
       //System.out.println(pq.comparator());


       //CREATING HEAP
       PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
       pq.offer(10);
       pq.offer(20);
       pq.offer(-10);
       pq.offer(1);
       //System.out.println(pq);
       System.out.println("The size of queue"+pq.size());
       System.out.println("Top element"+pq.peek());
       System.out.println("Empty"+pq.isEmpty());
       System.out.println("Contains"+pq.contains(1));
       System.out.println(pq.poll());
       Iterator i= pq.iterator();
       while(i.hasNext()){
        System.out.println(i.next()+" ");
       }



    
}
}