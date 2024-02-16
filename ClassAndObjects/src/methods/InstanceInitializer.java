package methods;

public class InstanceInitializer {
	
	{
		System.out.println("Inside Instance: ");
	}
	
	InstanceInitializer() {
		System.out.println("Inside a constructor");
	}

	public static void main(String[] args) {
		
		InstanceInitializer in = new InstanceInitializer();
		

	}

}
