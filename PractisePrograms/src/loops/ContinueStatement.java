package loops;

public class ContinueStatement {

	public static void main(String[] args) {

		int Arr[] = new int[] {1,2,3,4,5};
		
		System.out.println("printing All numbers except 3: ");
		
		for (int i = 0;i<Arr.length;i++) {
			if (Arr[i] == 3) {
				continue;
			}else {
				System.out.println(Arr[i]);
			}
		}
	}

}
