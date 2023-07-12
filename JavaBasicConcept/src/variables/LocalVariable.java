package variables;

public class LocalVariable {

	public LocalVariable() {
		int a = 7;
		System.out.println("constructor : " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Local variable: can be used within the method, constructor, blocks and it
		 * should be declared and initialized when it's not initialized it will throw
		 * compilation error 
		 * a local variable can be declared without initializing it. 
		 * However, you must assign a value to the variable before using it, otherwise, a compile-time error will occur
		 * scope: we can't able to access it outside the
		 * method,constructor, blocks 
		 * memory: memory created once the method - stored in stack area
		 * constructor, blocks created and released at execution of method, constructor,
		 * blocks 
		 * thread-safe: yes
		 * 
		 */
		LocalVariable lv = new LocalVariable();
		int a = 0;
		System.out.println("static main variable : " + a);

		lv.instanceVariable();
		staticVariable();
	}

	public void instanceVariable() {
		int a = 10;
		System.out.println("instance variable : " + a);
	}

	public static void staticVariable() {
		int a = 20;
		System.out.println("static variable : " + a);
	}

	static {
		int a = 5;
		System.out.println("static block : " + a);
	}

	{
		int a = 6;
		System.out.println("instance block : " + a);
	}

}
