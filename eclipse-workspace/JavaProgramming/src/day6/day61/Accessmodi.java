package day6.day61;

public class Accessmodi {

	public static void main(String[] args) {
		Accessmodi2 s=new Accessmodi2();
		s.m();//cannot access because it is private
		s.m1();//since it is default method so we can access
		s.m2();//protected fields we can access within package
		

	}

}
