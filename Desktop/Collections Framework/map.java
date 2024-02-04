import java.util.*;
public class map {
    public static void main(String[] args) {
        //In Java, Map Interface is present in java.util package represents a mapping between a key and a value. Java Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys.

       //Maps are perfect to use for key-value association mapping such as dictionaries. The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys
       //https://www.geeksforgeeks.org/map-interface-java-examples/

      //  1. HashMap  
     //HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. This class uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String. A shorter value helps in indexing and faster searches. Let’s see how to create a map object using this class.//

     Map<Integer,String> m=new HashMap<>();
     m.put(1,"h");
     m.put(2,"a");
     m.put(1,"b");
     m.put(2,"h");
     //System.out.println(m);
    // for(Map.Entry<Integer, String> e:m.entrySet()){
    //    System.out.println(e);
    // }
    //System.out.println(m.get(1));
    //
//In Java, the Map interface doesn't have a getKey() method directly. To retrieve keys from a Map, you need to use the keySet() method, which returns a Set containing all the keys. Then, you can iterate over this set to access each key.
   // for(Map.Entry<Integer, String> e :m.entrySet()){
   //     System.out.println(e.getKey()+" "+e.getValue());
   // }
   // Set<Integer> keys=m.keySet();
   // for (Integer key : keys) {
   //     String value = m.get(key);
   //     System.out.println(key + " " + value);
   // }

     
    //Only to get values
    //Collection<String> values = m.values();
    //System.out.println(values);

    //to get keys
    Set<Integer> keys=m.keySet();
    System.out.println(keys);

    
  
    }
    
}
