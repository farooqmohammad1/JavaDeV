package typesofclassess;
//have access to all instance members
//member inner class can be public private protected
class Outerpubli{
	int a=10;
	static int classVariabl=78;
	 class NestedClas{
		public void print() {
			System.out.println("Hi this is nested static class method"+classVariabl+" ");
	
}
	}

public class Nonstaticinnerclass {

	public static void main(String[] args) {
		Outerpubli o=new Outerpubli();
		Outerpubli.NestedClas n=o.new NestedClas();
		n.print();
		
	}
		

	}

}
