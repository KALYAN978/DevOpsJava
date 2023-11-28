
public class NonStaticMembersDemo {

	int num;

	public NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	// Non-Static Block
	//Non-Static Block executes every time when object has been created
	{
		System.out.println("Inside the Non-Static Block");
	}

	
	//
	public static void main(String[] args) {
		System.out.println("Inside the main Method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}
	
	
	static {
		System.out.println("Inside treh static block");
	}

}
