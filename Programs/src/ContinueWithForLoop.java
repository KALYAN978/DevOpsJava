
public class ContinueWithForLoop {

	public static void main(String[] args) {
		
		int numbers[] = {10,20,30,40,50};
		
		for(int i = 0;i < numbers.length;i++) {
			if(numbers[i] == 40) {
				continue;
			}
			System.out.println(numbers[i]);
			System.out.println('\n');
		}

	}

}
