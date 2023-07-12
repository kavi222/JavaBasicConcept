package variables;

public class StaticVariable {
	
	/*
	 * Static variable : declared inside class but outside of the methods
	 * and it should use static keyword before the variable
	 * 
	 * scope:
	 * inside the class all methods, constructor and blocks
	 * 
	 * memory allocated when class is loading and memory released when class is unloading 
	 * 
	 * No thread safe - not inherently thread-safe. 
	 * If multiple threads concurrently access and modify a static variable without 
	 * synchronization, it can lead to data inconsistencies or race conditions. 
	 * Proper synchronization mechanisms such as locks or the use of the synchronized keyword 
	 * may be required to ensure thread safety
	 * 
	 * Can static variables be overridden
	 * Static variables cannot be overridden in Java. They are associated with the class itself 
	 * and are not subject to inheritance or polymorphism. If a subclass declares a variable with 
	 * the same name as a static variable in the superclass, it simply hides the superclass variable
	 * 
	 * Can a static variable be accessed without creating an instance of the class
	 * Yes, static variables can be accessed without creating an instance of the class. Since they 
	 * belong to the class itself, you can access them directly using the class name
	 * 
	 * Can static variables be accessed from an instance method?
	 * 
	 */

	static int a=10;
	StaticVariable(){
		System.out.println("constructor : "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv = new StaticVariable();
      System.out.println("static main variable : "+a);
      sv.instanceVariable();
	}
	
	public static void staticVariable() {
		System.out.println("static variable : "+a);
	}
	
	public void instanceVariable() {
		System.out.println("static variable : "+a);
	}
	static {
		System.out.println("static block : "+a);
	}
	
	{
		System.out.println("instance block : "+a);
	}
	

}
