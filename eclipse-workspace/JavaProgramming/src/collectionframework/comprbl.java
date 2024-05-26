package collectionframework;
import java.util.*;
class Stu implements Comparable<Stu>{
	int id;
	String name;
	public int compareTo(Stu o) {
		return this.id-o.id;
		
	}
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	
}
class ex{
	int id;
	
	ex(int id){
		this.id=id;
		
	}
	@Override
	public String toString() {
		return " id=" + id + "";
	}
	
}

public class comprbl {

	public static void main(String[] args) {
		
		List<Stu> x=new ArrayList<>();
		x.add(new Stu(1,"A"));
		x.add(new Stu(3,"C"));
		x.add(new Stu(2,"B"));
		Collections.sort(x);
		for(Stu s:x) {
			System.out.println(s);
		}
		/*Uses Collections.sort(l, Comparator.comparingInt(e -> e.id)); to sort the list by id using a lambda expression.*/
		 List<ex> ee=new ArrayList<>();
		 ee.add(new ex(101));
		 ee.add(new ex(100));
		 ee.add(new ex(1));
		 
		 Collections.sort(ee,Comparator.comparingInt(e->e.id));//Uses Comparator.comparing to create a Comparator for sorting by id.
		 System.out.println(ee);
		
		
		
 

	}

}
