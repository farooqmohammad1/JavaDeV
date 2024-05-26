package typesofclassess;

import typesofclassess.Outer.Nest;

//one inner class can inherit another innerclass within same outerclass
//static inner class is inherited by different other class

//non-static inner class inherited by different class

class Outer{
	class Inner{
		void p() {
			System.out.println("This is Inner p method");
		}
	}
	class Inner2 extends Inner{
		
		
	}
	static class Nest{
		void pp() {
			System.out.println("This is static Inner pp method");
		}
		
	}
}
class OO extends Outer.Nest{
	
	
}

public class InheritanceinNested  {

	public static void main(String[] args) {
		OO oo=new OO();
		oo.pp();
		Outer o=new Outer();
		//Outer.Inner2 i2=o.new Inner2();
		//i2.p();
	
		
	

	}

}
