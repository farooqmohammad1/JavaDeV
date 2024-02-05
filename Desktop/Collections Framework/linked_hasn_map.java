import java.util.*;
import java.util.Map.Entry;
public class linked_hasn_map {
    public static void main(String[] args) {
        //LinkedHashMap is just like HashMap with the additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order. Let’s see how to create a map object using this class.
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");
       // for(Map.Entry<Integer, String> e:m.entrySet()){
       //     System.out.println(e.getKey()+" : "+e.getValue());
       //     
       // }

       //Updating value

       //m.put(1,"A");

       
       //for(Map.Entry<Integer,String> e:m.entrySet()){
       // System.out.println(e);
       //}
       System.out.println(m.remove(1,"a"));
       System.out.println(m);
    }
}
