package practiseprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		//number of elements to generate in series 
//		
//		int limit = 20;
//		
//		long series[] = new long[limit];
//		
//		// create first 2 series elements
//		
//		series[0] = 0; series[1] = 1;
//		
//		
//		// create the fibonacci series and store it in an array
//		for(int i = 2;i<limit;i++) {
//			series[i] = series[i-1] + series[i-2];
//		}
//		
//		//print the fibonacci series numbers
//		System.out.println("Fibonacci Series upto: " + limit );
//		
//		for (int i = 0;i<limit;i++) {
//			System.out.println(series[i] + "");
//		}
		
		
		int limit = 30;
		
		long series[] = new long[limit];
		
		// create 1st two series
		series[0] = 0; series[1] = 1;
		
		// Create the fibonacci series and store it in the array
		
		for (int i =2;i<limit;i++) {
			series[i] = series[i-1] + series[i-2];
		}
		
		//printing the fibonacci series
		for(int i = 0;i<limit;i++) {
			System.out.println(series[i]);
		}
		
		
		
		
		
		
		
	}

}
