
public class BankAccount {
	//attributes
	protected People accountName;
	protected int accountNumber;
	protected double accountBalance;
	protected static int nextAccountNumber = 0;
	
	//constuctor
	public BankAccount (People Name) {
		this.accountName = Name;
		accountBalance = 0.0;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
		
	}
	//Generated getters but not setters according to the lab instruction
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//Adding methods
	
	public double balance() {
		double balance = accountBalance;
		return balance;
	}
	
	public double deposit( double deposit) {
		accountBalance += deposit;
		return deposit;
	}
	
	public double withdraw (double withdraw) {
		accountBalance -= withdraw;
		return withdraw;
	}
	
	public String toString() {
		return accountName + " my account Number is " + accountNumber + " and my balance is " + accountBalance;
		
	}
	
	public double transferFunds(double amount, BankAccount destination) {
		destination.accountBalance = destination.accountBalance + amount;
		accountBalance -= amount;
		return destination.accountBalance;
	}
	
}
