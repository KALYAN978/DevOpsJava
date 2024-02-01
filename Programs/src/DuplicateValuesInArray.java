
public class DuplicateValuesInArray {

	public static void main(String[] args) {

		int[] ar = {20,30,40,50,15,80,30,50};
		
		for(int i = 0;i<ar.length-1;i++) {
			for(int j = i+1; j < ar.length; j++) {
				{
					if((ar[i] == ar[j]) && i != j ) {
						System.out.println("Duplicate Element is " + ar[j]);
					}
				}
			}
		}
	}

}
