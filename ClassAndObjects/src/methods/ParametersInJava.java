package methods;

public class ParametersInJava {
	
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping, " + a + " and b = "+ b);
		
		//  Swap n1 with n2
		
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping values(Inside), a = "+ a +"b = "+ b);
	}

	public static void main(String[] args) {
		
		int a = 30;
		int b = 45;
		System.out.println("Before Swapping : " + a + b);
		
		
		// Invoke the swap methods
		
		swapFunction(a,b);
		System.out.println("Before swapped values a: " + a + "b : " + b);
		
		
	}

}
