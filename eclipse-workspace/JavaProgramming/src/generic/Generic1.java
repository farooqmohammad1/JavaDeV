package generic;
 class Gen{
	Object obj;
	void set(Object obj) {
		this.obj=obj;
	}
	Object get() {
		return obj;
	}
}

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen g=new Gen();
		g.set(10);
		Object value=(Object) g.get();
		//We cannot use value directly have to typecast
		//if((int)value==1) {}
		

	}

}
