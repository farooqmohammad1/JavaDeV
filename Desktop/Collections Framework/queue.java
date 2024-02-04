import java.util.*;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        //The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.//
        //https://www.geeksforgeeks.org/queue-interface-java/

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //System.out.println(queue);
        //System.out.println(queue.peek());
        queue.offer(11);
        for(Integer qu:queue){
            System.out.print(qu+" ");
        }
        System.out.println(queue.size());
        //System.out.println(queue);
       // System.out.println(queue.poll());


        
    }
}
