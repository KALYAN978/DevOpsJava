package Polymorphism.overloading;

public class AutomaticPromotion {
	
	
	public void print(int i) {
		System.out.println("Integer Version: "+ i);
	}
	
	
	public void print(float f) {
		System.out.println("float Version: "+ f);
	}
	
	
	
	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(0.5f);
		ap.print(78);
		
		

	}

}
