
public class BankAccount {
	
	static String bankName = "SWIS BANK";
	
	String accountHolderName;
	String accountNumber;
	double balance;

	public static void main(String[] args) {
		double loanInterestRate = 7.5;  //localVariable
		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHolderName = "John";
		bankAccount.accountNumber = "2342453453";
		bankAccount.balance = 100000000000000000000.0000;
		System.out.println(bankAccount.balance);

		
	}

}
