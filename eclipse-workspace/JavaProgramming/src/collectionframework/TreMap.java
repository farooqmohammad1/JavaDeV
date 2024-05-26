package collectionframework;
import java.util.*;

//The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. 
//The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time,
//depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. 
//The storing order maintained by the treemap must be consistent with equals just like any other sorted map, 
//irrespective of the explicit comparators. 
//Let’s see how to create a map object using this class.

public class TreMap {

	public static void main(String[] args) {
		Map<Integer,String> tmap=new TreeMap<>((Integer i1,Integer i2)->i2-i1);
		
		 tmap.put(1,"1");
	     tmap.put(3,"0");
	     tmap.put(0,"3");
	     System.out.println(tmap);
	     for(Map.Entry<Integer,String>  ee:tmap.entrySet()) {
	    	 System.out.println(ee);
	     }
		

	}

}
