package typesofclassess;

//Local inner class defined with in block like loop,method etc..
//only default not all like public ..
//cannot be instantiated outside block

class Outerpubl {
    int a = 10;
    static int classVariab = 78;

    public void print() {
        class LocalinnerCl {
            void dis() {
                // Can access instance variables and static variables of the outer class
                System.out.println("Hi, this is a local inner class method. Instance variable: " + a + ", Static variable: " + classVariab);
            }
        }

        // Creating an instance of the local inner class and calling its method
        LocalinnerCl localInner = new LocalinnerCl();
        localInner.dis();
        /*Scope: Local inner classes are designed to be used only within the method they are defined in.
         *  This means you cannot instantiate them outside of that method, such as in the main method.
Encapsulation: This design pattern ensures that the inner workings of a method (including any helper classes it uses)
 remain hidden from the outside world, promoting encapsulation and reducing complexity.
*/
    }
}

	

public class Localinnerclass {

	public static void main(String[] args) {
		Outerpubl o=new Outerpubl();
		o.print();


	}

}
