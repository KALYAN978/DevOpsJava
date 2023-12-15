package whileloop;

public class WhileLoop1 {
	
	int number = 4;
	int finishNumber = 20;
	int evenCount = 0;
	int oddCount = 0;
	
	while(number <= finishNumber) {
		number++;
		if(!isEvenNumber(number)) {
			oddCount;
			continue;
		}
		System.out.println("EvenNumber" + number);
		evenCount++;
		if(evenCount >= 5) {
			break;
		}
	}
	
	
	public static boolean isEvenNumber(int number) {
		if((number%2) == 0) {
			return true;
		}else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		
		

	}

}
