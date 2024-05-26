package streamsAPI;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/*
 * Collection represent group of objects/data as a single entity
 * 
 * Streams are used to process the data streams from collections*/
class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Filter {

	public static void main(String[] args) {
		List<Product> p=new ArrayList<>();
		p.add(new Product(1,"HP",40000));
		p.add(new Product(2,"Dell",30000));
		p.add(new Product(3,"Acer",32000));
		p.add(new Product(4,"Lenovo",430));
		p.add(new Product(5,"Reno",40020));
		
		p.stream().
		          filter(ss->ss.price>=35000).
		          forEach(names->System.out.println(names.name));
		
		
		 List<Integer> l=new ArrayList<>();
		 l.add(10);
		 l.add(11);
		 l.add(12);
		 l.add(13);
		 l.add(14);
		 
		 List<Integer> ll=new ArrayList<>();
		ll= l.stream().filter(num->num%2==0).collect(Collectors.toList());
		//first converting list to stream
		//then applying methods of stream
		//next converting the processed stream into mutable list
		System.out.println(ll);
		
		List<String> s=new ArrayList<>();
		s.add("andjfjff");
		s.add("andjfgjgjjff");
		s.add("anfjff");
		s.add("andjffjjff");
		List<String> result=new ArrayList<>();
		result=s.stream().filter(str->str.length()>6 && str.length()<=8).collect(Collectors.toList());
		System.out.println(result);
		 

	}

}
/*Sure, I can provide more information and examples about using Collectors.toList() 
 * in the context of Java Streams.
 

Collectors.toList()
Collectors.toList() is a part of the java.util.stream.Collectors class,
 and it is used to collect the elements of a stream into a List.

Example Usage of Collectors.toList()
Here's an example that demonstrates how to use Collectors.toList() to collect elements from a stream into a list:

java
Copy code
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToListExample {
    public static void main(String[] args) {
        // Example 1: Convert a Stream to a List
        Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
        List<String> list = stream.collect(Collectors.toList());
        
        System.out.println("List: " + list);
        
        // Example 2: Filter and collect
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
                                           
        System.out.println("Even Numbers: " + evenNumbers);
        
        // Example 3: Map and collect
        List<String> upperCaseList = list.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
                                         
        System.out.println("Uppercase List: " + upperCaseList);
    }
}
Detailed Explanation
Example 1: Convert a Stream to a List

Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
List<String> list = stream.collect(Collectors.toList());
System.out.println("List: " + list);
This example creates a stream of strings and then collects them into a list using Collectors.toList().
The resulting list contains the elements "Apple", "Banana", and "Cherry".
Example 2: Filter and Collect
java
Copy code
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
System.out.println("Even Numbers: " + evenNumbers);
This example creates a list of integers and converts it into a stream.
The stream is then filtered to keep only even numbers.
Finally, the filtered stream is collected into a new list using Collectors.toList().
The resulting list contains the even numbers: [2, 4, 6].
Example 3: Map and Collect
java
Copy code
List<String> upperCaseList = list.stream()
                                 .map(String::toUpperCase)
                                 .collect(Collectors.toList());
System.out.println("Uppercase List: " + upperCaseList);
This example takes the list of strings created in Example 1 and converts it into a stream.
The stream is then mapped to convert each string to uppercase.
Finally, the mapped stream is collected into a new list using Collectors.toList().
The resulting list contains the uppercase versions of the strings: ["APPLE", "BANANA", "CHERRY"].
Summary
Collectors.toList() is a convenient way to collect elements from a stream into a list.
It is often used in conjunction with other stream operations such as filter(), map(), and flatMap().
The resulting list is mutable and can be used just like any other list in Java.
These examples and explanations should give you a good understanding of how to use Collectors
.toList() in various scenarios. If you have any specific questions or need further details,
 feel free to ask!





*/