import java.util.*;
public class List{
    public static void main(String[] args) {

        //It is a child interface of the collection interface. This interface is dedicated to the data of the list type in which we can store all the ordered collections of the objects. This deals with the index or position-specific functions like getting an element or setting an element. It deals with the arrays and lists types of operations like ArrayList, LinkedList, Vector, and Stack.//

        //Arraylist
        //ArrayList is a Java class implemented using the List interface. Java ArrayList, as the name suggests, provides the functionality of a dynamic array where the size is not fixed as an array. Also, as a part of the Collection framework, it has many features not available with arrays.//
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        //list1.remove(2);
        list1.set(1,40);
       // System.out.println(list1.get(1));                                                                                                                                                                                                                                                                                                                        
       // System.out.println(list1);
      // System.out.println(list1.size());
      // for(Integer list:list1){
      //  System.out.println(list);
      // }

        //For each loop
       // for(Integer arr:list1){
       //     System.out.println(arr);
       // }
    }
      

}