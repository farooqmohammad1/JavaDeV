package lambda;
import java.util.function.Function;
import java.util.*;

//internal implementation
/*
 * interface Function<T,R>//object type,return type{
 * void apply(T);*/
//}
//1.It returns a value

class Emp{
	int sal;
	String nam;
	Emp(int sal,String nam){
		this.sal=sal;
		this.nam=nam;
	}
}
public class FuncInter {

	public static void main(String[] args) {
		//Function<Integer,Integer> i=n->n*n;
		//System.out.println(i.apply(4));
		ArrayList<Emp> emplist=new ArrayList<>();
		emplist.add(new Emp(1000,"joh"));
		emplist.add(new Emp(2000,"hoh"));
		emplist.add(new Emp(3000,"aoh"));
		
		Function<Emp,Integer> ff=(e)->{
			int salary=e.sal;
			if(salary>=1000) {
			
			return salary*10/100;}
			else {
				return 0;
			}	
		
		};
		
		for(Emp w:emplist) {
			int bonus=ff.apply(w);
			w.sal+=bonus;
			System.out.println(w.nam+" "+w.sal);
			System.out.println(bonus);
		}
		
	}

}
