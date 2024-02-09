
public class ContinueWithDoWhileLoop {

	public static void main(String[] args) {
		
		int x = 10;
		
		do {
			x++;
			if(x == 15) {
				continue;
			}
			
			System.err.println("Value of item : "+ x);
			System.out.println("\n");
			
		}while(x < 20);

	}

}
