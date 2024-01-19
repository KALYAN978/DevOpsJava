package practiseprograms;


//program to print largest element in an array

/*

Step 1: Start
Step 2: Initialise arr[] = {25, 11, 7, 75, 56}
step 3: max = arr[0]
step 4: Repeat Step for(i = 0;i<arr.length;i++)
Step 5: if(arr[i]>max = arr[i]
step 6: PRINT "Largest element in given array"
step 7: PRINT max
step 8: END
 */
public class LargestElementInaArray {
	
	public static void main (String args[]) {
		
		
		// intialize array
		
		int arr[] = new int[] {25,11,7,75, 56};
		
		//Initialize max with first element of array
		
		int max = arr[0];
		
		//Loop through the array
		for(int i =0;i < arr.length; i++) {
			//Compare elements of array with max
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("Largest element present in given array: "+ max);
		
	}
	
	

}
