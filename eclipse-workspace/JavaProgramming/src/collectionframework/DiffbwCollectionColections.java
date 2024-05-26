package collectionframework;

public class DiffbwCollectionColections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In Java, Collection and Collections are two distinct concepts within the Java Collections Framework, and they serve different purposes. Here's a detailed explanation of each:

Collection
Definition: Collection is an interface in the Java Collections Framework. 
It is the root interface for the collection hierarchy.
 It represents a group of objects known as elements.
Part of the java.util package: The Collection interface is a part of the java.util package.
Subinterfaces: It has several subinterfaces like List, Set, Queue, etc. Each subinterface provides specific methods for different collection types.
Common Methods:
 The Collection interface includes methods like add(), remove(), size(), clear(), iterator(), 
 and more.
Usage: You use the Collection interface and its subinterfaces to create and manipulate groups of 
objects.
 It provides the abstract definitions for operations that can be performed on a collection of 
 objects.
Example of Using Collection
java
Copy code
import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Apple");
        coll.add("Banana");
        coll.add("Cherry");
        
        System.out.println("Collection: " + coll);
    }
}
Collections
Definition: Collections is a utility class in the Java Collections Framework. 
It consists entirely of static methods that operate on or return collections.
Part of the java.util package: The Collections class is also part of the java.util package.
Methods: The Collections class includes methods for algorithms such as sorting, searching, 
reversing, and more. Methods include sort(), binarySearch(), reverse(), shuffle(),
 unmodifiableList(), synchronizedList(), etc.
 
Usage: You use the Collections class to perform various operations on collections,
 such as sorting a list or finding an element in a collection.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        // Sort the list
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
Key Differences
Collection:

It is an interface.
Represents a group of objects (elements).
Provides abstract methods that must be implemented by concrete classes.
Examples: List, Set, Queue.
Collections:

It is a utility class.
Provides static methods to operate on collections.
Includes methods for algorithms such as sorting, searching, and synchronization.
Examples: Collections.sort(), Collections.reverse(), Collections.synchronizedList().
Summary
Use the Collection interface (and its subinterfaces) to define and create collections of objects.
Use the Collections class to perform operations on collections, such as sorting or synchronizing them.
Understanding the distinction between these two helps you effectively use the Java Collections Framework to manage and manipulate groups of objects.





*/

	}

}
