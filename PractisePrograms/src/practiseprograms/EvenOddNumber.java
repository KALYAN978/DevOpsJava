package practiseprograms;

public class EvenOddNumber {

	public static void main(String[] args) {

		//Create an array of 10 integers
		
		int Arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0;i<Arr.length;i++) {
			if(Arr[i]%2 == 0) {
				System.out.println("Even Numbers are: "+ Arr[i]);
			}
			else {
				System.out.println("Odd Numbers are: "+ Arr[i]);
			}
		}
		
	}

}
