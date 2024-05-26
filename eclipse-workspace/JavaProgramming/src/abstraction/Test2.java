package abstraction;

interface AdvancedInterface {
    void normalMethod();

    default void firstDefaultMethod() {
        System.out.println("Inside first default method");
        helperMethod();
    }

    default void secondDefaultMethod() {
        System.out.println("Inside second default method");
        helperMethod();
    }

    static void firstStaticMethod() {
        System.out.println("Inside first static method");
        staticHelperMethod();
    }

    static void secondStaticMethod() {
        System.out.println("Inside second static method");
        staticHelperMethod();
    }

    // Private helper method
    private void helperMethod() {
        System.out.println("Inside private helper method");
    }

    // Private static helper method
    private static void staticHelperMethod() {
        System.out.println("Inside private static helper method");
    }
}
class AdvancedClass implements AdvancedInterface {
    @Override
    public void normalMethod() {
        System.out.println("Inside normal method of AdvancedClass");
    }
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdvancedClass advancedClass = new AdvancedClass();
       // advancedClass.normalMethod();
       //advancedClass.firstDefaultMethod();
        //advancedClass.secondDefaultMethod();

        AdvancedInterface.firstStaticMethod();
       // AdvancedInterface.secondStaticMethod();

	}

}
