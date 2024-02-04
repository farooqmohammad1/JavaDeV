import java.util.*;

import java.util.List;
import java.util.LinkedList;

public class linked_list{
    public static void main(String[] args) {

        //Here, you are explicitly declaring a variable of type LinkedList and initializing it with a LinkedList instance that stores elements of type Integer. Note that in modern Java, it's recommended to use generic types to provide type safety. Although it is syntactically correct, it's better to use generic types like this:
        LinkedList link=new LinkedList<Integer>();
        link.add(10);
        link.add(30);
        link.add(300);
        link.addFirst(200);
        link.addLast(100);
       
       // link.removeFirst();
       //link.removeLast();
        //System.out.println(link);
        for(Object arr:link){
            System.out.println(arr);

        }


       //Above we implements LinkedList with List interface.. Using List interface with LinkedList implementation:
       // List<Integer> link1 = new LinkedList();
       // link1.add(10);
       // link1.add(20);
       // link1.set(1,200);
       // link1.add(300);
       // link1.add(70);
       // System.out.println(link1);

        //link1.remove(2);
        //System.out.println(link1.get(0));
        //for(Integer arr:link1){
//
        //    System.out.println(arr);
        //}




        
    }
}