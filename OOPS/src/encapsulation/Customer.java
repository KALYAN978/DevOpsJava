package encapsulation;

// How to write the Encapsulation in java
//  1st ) U have to write Data Members as private
//	2nd) U have to define Getter Methods and Setter Methods for each field
//	3rd) With the help of the getter and setter methods we achieve the encapsulation




public class Customer {
	
	private String firstName;
	private String lastName;
	private String creditCard;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		// Set Method will always be void. it wont return anything
		this.firstName  = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	

}
