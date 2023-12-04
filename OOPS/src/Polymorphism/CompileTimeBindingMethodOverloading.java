package Polymorphism;

public class CompileTimeBindingMethodOverloading {
	
	
	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is: "+ result);
	}
	
	
	void add(int a,int b,int c) {
		int result = a+b+c;
		System.out.println(result);
	}
	
	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result in float is : "+ result);
	}

	public static void main(String[] args) {
		CompileTimeBindingMethodOverloading obj = new CompileTimeBindingMethodOverloading();
		
		obj.add(12, 231);
		obj.add(24,354,45);
		obj.add(22.3f, 34.4f);

	}

}
