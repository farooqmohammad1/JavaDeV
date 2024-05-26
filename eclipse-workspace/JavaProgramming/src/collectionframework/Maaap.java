package collectionframework;
import java.util.*;

//Map is a part of collection framework but i is a separarte interface with its own hierarchy

/*1. HashMap
Characteristics: Implements Map with a hash table. Allows null values and one null key.
Order: Does not guarantee any order of keys.
Performance: Offers constant-time performance for basic operations (put, get, remove), assuming hash function disperses elements properly.
Usage: Suitable for most general-purpose applications where insertion and lookup performance is critical.*/

/*
 * m.entrySet():

The entrySet() method of the Map interface returns a Set view of the mappings contained in the map.
Each element in this set is a Map.Entry<K, V>, which represents a key-value pair.
Map.Entry<Integer, String>:

This is the type of the elements in the set returned by entrySet(). It indicates that each entry in the map has an Integer key and a String value.
Map.Entry is a nested interface in Map that represents a key-value pair.
e : m.entrySet():

This is the for-each loop syntax in Java. It iterates over each Map.Entry<Integer, String> object in the set returned by m.entrySet().
For each iteration, the current Map.Entry<Integer, String> object is assigned to the variable e.
e.getKey():

The getKey() method of Map.Entry returns the key corresponding to the entry.
e.getValue():

The getValue() method of Map.Entry returns the value corresponding to the entry.
System.out.println(e.getKey() + " " + e.getValue()):

This line prints the key and value of the current entry, separated by a space.*/


public class Maaap {

	public static void main(String[] args) {
		//Hashmap does not maintains the order
		//can store null key or values
		//Insertion order does not maintain
		//Keys are unique
		Map<Integer,String> mm=new HashMap<>();
		mm.put(1, "H");
		mm.put(2, "l");
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		//System.out.println(m.get(1));
		System.out.println(m.remove(1));
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue(2));
        m.putAll(mm);
        System.out.println(m);
        //The putAll method does not return a value (it is void), so you cannot print its result directly.
		
		//Set<Map.Entry<K, V>> entrySet(): Returns a set view of the key-value mappings.
		//for(Map.Entry<Integer,String> a:m.entrySet()) {
			//System.out.println(a.getKey());
			//System.out.println(a.getValue());
		//}
        
        //Set<Map.Entry<K,V>> entryset():Entry is a subinterface so to access Map.Entry() and it has methods getkey getvalue
        /*Map.Entry Interface: Represents a key-value pair.
       entrySet Method: Returns a set view of the mappings contained in the map.*/
        
        for(Map.Entry<Integer, String> q:m.entrySet()) {
        	System.out.println(q.getValue());
        }
		
		

	}

}
