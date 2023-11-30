package loops;

public class BreakStatementWithLabel {

	public static void main(String[] args) {
		
		
		int Arr[][] = new int[][] {{1,2,3,4,5},{6,7,8,9,10}};
		
		boolean blnFound = false;
		
		System.out.println("Searching 8 in the Two Dimensional Array");
		
		i : for(int i=0;i<Arr.length;i++) {
			j : for(int j = 0;j<Arr[i].length;j++) {
				if(Arr[i][j] == 8) {
					blnFound = true;
					break;
				}
			}
		}
		if(blnFound == true) {
			System.out.println("8 is found in the array");
		}else {
			System.out.println("8 Not found in the Array");
		}
	}

}
