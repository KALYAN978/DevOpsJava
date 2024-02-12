package methods;

public class Methods {
	
	// Creating a static method
	static void fun1() {
		System.out.println("f1: This is static method");
	}
	
	
	// Creating a public method
	
	public void fun2() {
		System.out.println("fun2: This is a public method: ");
	}
	
	

	public static void main(String[] args) {
		
		// Accessing static method through class
		fun1();
		
		//creating an object for the main class
		Methods m = new Methods();
		
		// Accessing public method through the object
		m.fun2();

	}

}
