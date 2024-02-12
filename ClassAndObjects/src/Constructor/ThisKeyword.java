package Constructor;

public class ThisKeyword {
	
	int num = 10;
	
	public ThisKeyword() {
		System.out.println(" This is an Example of this. Keyword");
	}
	
	
	ThisKeyword(int num){
		// Invoking the default consrtuctor
		this();
	}
	
	
	public void greet() {
		System.out.println("Hi Welcome to Java");
		
	}
	
	
	public void print() {
		//Local Variable Num
		int num = 20;
		
		//printing the local variable
		System.out.println("Value of local variable" + num);
		
		//printing the instance variable
		System.out.println("Value of instance variable" + this.num);
		
		
		//Invoking thegreet method
		this.greet();
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		
		
		//Invoking the print method
		tk.print();
		
		
		ThisKeyword tk1 = new ThisKeyword();
		
		tk1.print();
		

	}

}
