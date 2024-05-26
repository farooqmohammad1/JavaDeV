package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pro{
	int id;
	String name;
	public Pro(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}
	
}
public class Comprtr2 {

	public static void main(String[] args) {
		
		List<Pro> cc=new ArrayList<>();
		cc.add(new Pro(2,"A"));
		cc.add(new Pro(1,"D"));
		cc.add(new Pro(4,"C"));
		Collections.sort(cc,(Pro o1,Pro o2)->o1.id-o2.id);
		Collections.sort(cc,(Pro o3,Pro o4)->o3.name.compareTo(o4.name));
		for(Pro p:cc) {
			System.out.println(p);
		}
	

	}

	

}
