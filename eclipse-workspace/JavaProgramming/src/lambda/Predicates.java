package lambda;
import java.util.*;
import java.util.function.Predicate;
class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class Predicates {

	public static void main(String[] args) {
		
		
		
		Employee e=new Employee(101,"A");
		Employee e1=new Employee(102,"B");
		Employee e2=new Employee(103,"C");
		Employee e3=new Employee(104,"D");
		
		Predicate<Employee> pp=ee->(ee.id>10
				3);
		
		ArrayList<Employee> l=new ArrayList<>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		for(Employee t:l) {
			if(pp.test(t)) {
				System.out.println(t.id+" "+t.name);
				
			}
		}
		
		
		
		
	//Predicate<Integer> p=a->{
		//if(a>10);
		//return ("Hi") != null;
		
		
	//};
//	p.test(100);

	}

}
