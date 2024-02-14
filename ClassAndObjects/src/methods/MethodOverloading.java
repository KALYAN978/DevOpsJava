package methods;

public class MethodOverloading {
	
	
	public static int minFunction(int n1, int n2) {
		int min;
		if(n1 > n2) {
			min = n2;
		}
		else {
			min = n1;
		}	
		return min;
	
					

		}
	

	public static void main(String[] args) {
		
		int a  = 11;
		int b = 6;
		double c = 7.3;
		double d = 9.4;
		
		int result = minFunction(a,b);

	}

}
