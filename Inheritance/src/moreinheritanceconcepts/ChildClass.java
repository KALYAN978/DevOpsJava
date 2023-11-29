package moreinheritanceconcepts;

public class ChildClass extends SuperClass {
	
	ChildClass() {
		this(10);
		System.out.println("No Args Child Class Constructor");
	}
	
	
	ChildClass(int x) {
		super(x);  //we are passing the value to the super constructor
		System.out.println(" Args Child Class Constructor");
	}
	
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
	}
	

}
