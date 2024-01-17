package oopsbasics;

public class MethodReturnType {
	
	
	static int product(int x,int y) {
		return x*y;
	}

	
//	lets take two parameters and returns the greatest one
	static int max(int x,int y) {
		
		if( x > y) {
			return x;
		}else {
			return y;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(product(56, 56));
		
		
		
		int z = max(1,8);
		System.out.println(z);
		

	}




}
