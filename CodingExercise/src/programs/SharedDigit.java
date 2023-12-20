//package programs;
//
//public class SharedDigit {
//	
//	
//	public static boolean hasSharedDigit(int num1, int num2) {
//		if(!isValid(num1) || isValid(num2){
//			return false;
//		}
//	}
//	
//	int tempNum1 = num1;
//	while(tempNum1 > 0) {
//		int digit1 = tempNum1 % 10;
//		int tempNum2 = num2;
//		
//		while(tempNum2 > 0) {
//			int digit2 = tempNum2 % 10;
//			
//			if(digit1 == digit2) {
//				return true;  // Found a shared digit
//			}
//			tempNum2 /= 10;
//		}
//		tempNum1 /= 10;
//	}
//	return false;
//	
//	
//	
//
//	public static void main(String[] args) {
//		System.out.println(hasSharedDigit(12, 23));
//		System.out.println(hasSharedDigit(9, 99));
//		System.out.println(hasSharedDigit(15, 55));
//		
//		
//		
//		
//		
//		
//
//	}
//
//}
