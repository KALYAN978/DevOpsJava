
public class StaticMethodsDemo {
	
	public static void main(String []args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method();
		
	}
	
	static void method() {
		System.out.println("Inside Method1");
	}
	
	static {
		System.out.println("Inside the static block");
	}

}
