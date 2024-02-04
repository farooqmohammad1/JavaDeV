import java.util.*;
import java.util.Iterator;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.remove(3);
        System.out.println(s.hashCode());
       // Iterator i=s.iterator();
       // while(i.hasNext()){
       //     System.out.println(i.next());
       // }
       // ArrayList a=new ArrayList<>();
       // a.add(4);
       // a.add(5);
       // a.add(4);
       // s.addAll(a);

         //System.out.println(s.contains(2));
        
        //System.out.println(s);
       // for(Integer arr:s){
       //     System.out.println(arr);
       // }
        
    }
}
