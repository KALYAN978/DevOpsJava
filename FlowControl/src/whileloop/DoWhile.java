package whileloop;

public class DoWhile {

	public static void main(String[] args) {
		
		for( int i =1;i<=5;i++) {
			System.out.println(i);
		} 
		
		
		
		int j = 1;
		boolean isReady = false;
		do {
			if(j>5) {
				break;
			}
			System.out.println(j);
			j++;
		}while(isReady);

	}
}  
