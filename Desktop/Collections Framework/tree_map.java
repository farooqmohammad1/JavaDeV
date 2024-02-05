import java.util.*;
public class tree_map {
    public static void main(String[] args) {
        //The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. Let’s see how to create a map object using this class.//
        Map<Integer,String> tmap=new TreeMap<>();
        tmap.put(1,"A");
        tmap.put(2,"B");
        tmap.put(3,"C");
        //for(Map.Entry<Integer,String> e:tmap.entrySet()){
        //    System.out.println(tmap);
        //}
        tmap.put(2,"D");
        System.out.println(tmap);
    }
}
