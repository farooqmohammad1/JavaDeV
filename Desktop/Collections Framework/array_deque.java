import java.util.*;
public class array_deque {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/arraydeque-in-java/
        //The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 

        //The ArrayDeque class in Java is an implementation of the Deque interface that uses a resizable array to store its elements. This class provides a more efficient alternative to the traditional Stack class, which was previously used for double-ended operations. The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, making it a good choice for scenarios where you need to perform many add and remove operations.
        Deque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        adq.offerFirst(30);
        adq.offerLast(1);
        //System.out.println(adq.peek());
        //System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());


    }
}
