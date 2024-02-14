package methods;


class Calculator{
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
}


public class StaticBinding {
		
	public static void main(String[] args) {
		
		System.out.println(Calculator.add(23, 34));
		System.out.println(Calculator.add(23, 34,454));

	}

}
