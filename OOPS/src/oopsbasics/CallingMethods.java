package oopsbasics;

public class CallingMethods {
	

	void sayHello() {
		System.out.println("Calling Methods");
	}
	
	
	static void hello() {
		System.out.println("call");
	}
	
	
	static void name(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		
		CallingMethods callingMethods = new CallingMethods();
		
		callingMethods.sayHello();
		callingMethods.sayHello();
		callingMethods.sayHello();
		
		hello();
		hello();
		hello();
		
		
		
		name("CG");
		

	}

}
