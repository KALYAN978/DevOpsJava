package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setFirstName("Capgemini");
		c.setLastName("Hyderabad");
		c.setCreditCard("1234");
		
		
		System.out.println("FirstName: " + c.getFirstName());
		System.out.println("LastName: "+ c.getLastName());
		System.out.println("CreditCard: "+ c.getCreditCard());

	}

}
