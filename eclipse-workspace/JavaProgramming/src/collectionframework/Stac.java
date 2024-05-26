package collectionframework;
import java.util.*;

public class Stac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		System.out.println(s);
		//for(Integer i:s) {
			//System.out.println(i);
		//}
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.remove(Integer.valueOf(10)));
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.isEmpty());

	}

	

}


/*In Java, Collection and Collections are distinct but related concepts within the Java Collections Framework.
 *  They serve different purposes and have different functionalities.
 *   Here's a detailed explanation of the differences between Collection and Collections:
 */
/*
Collection
Interface: Collection is an interface.
Purpose: It provides the basic structure for all collection types, including lists, sets, and queues.
Key Methods: The Collection interface defines methods like add, remove, size, clear, isEmpty, contains, and more.
Subinterfaces: List, Set, and Queue are subinterfaces of Collection.

Implementations: Some common implementations of Collection include ArrayList, HashSet, LinkedList, and PriorityQueue.


import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        for (String item : collection) {
            System.out.println(item);
        }
    }
}
Collections
Utility Class: Collections is a utility class.
Purpose: It provides static methods to operate on or return collections. This includes methods for sorting, searching,
 and synchronizing collections.
Key Methods: Methods like sort, reverse, shuffle, binarySearch, synchronizedList, unmodifiableList, and more.
Usage: The methods in the Collections class are typically used to perform operations on instances of the Collection interface and its subinterfaces.
Example
java
Copy code
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");

        // Sorting the list
        Collections.sort(list);

        // Printing the sorted list
        for (String item : list) {
            System.out.println(item);
        }
    }
}
Key Differences
Type:

Collection: An interface that defines the standard operations for data structures that hold a collection of objects.
Collections: A utility class with static methods to perform various operations on collections.
Functionality:

Collection: Used to represent and manipulate collections of objects.
Collections: Used to provide utility methods that operate on collections.
Usage Context:

Collection: You work with Collection when you want to define a variable, return a collection, or manipulate a collection using its methods.
Collections: You use Collections when you want to perform operations like sorting, searching, or making a collection thread-safe or unmodifiable.
Summary
Collection: An interface representing a group of objects. It provides the basic operations for manipulating those objects.
Collections: A utility class that provides methods to perform common operations on collections, such as sorting, searching, and synchronizing.
Understanding the distinction between Collection and Collections is fundamental to effectively using the Java Collections Framework.





*/