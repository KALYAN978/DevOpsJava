package loops;

public class BreakStatement {

	public static void main(String[] args) {

		int Arr[] = {1,2,3,4,5,6};
		System.out.println("Elements less than 3 are: ");
		
		for(int i = 0;i<Arr.length;i++) {
			if(i == 3) {
				break;
			}
			else {
				System.out.println(Arr[i]);
			}
		}
		
	}

}
