import java.util.*;
public class linkedlist_set {
    public static void main(String[] args) {
        //The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.//
        LinkedHashSet<Integer> ll=new LinkedHashSet<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.remove(2);
        //System.out.println(ll.contains(2));
       // System.out.println(ll.size());
       // System.out.println(ll);
        //for(Integer i:ll){
        //    System.out.println(i);
        //}

    
    }
}
