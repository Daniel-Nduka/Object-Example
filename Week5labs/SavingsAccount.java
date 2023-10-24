
public class SavingsAccount extends BankAccount {
	protected double interestRate;
	
	public SavingsAccount(People Name) {
		super(Name);
		this.interestRate = 0.0;
	}
	
	public double withdraw (double withdraw) {
		if ( withdraw > accountBalance)
		{
			System.out.println("Can't make this withdrawal cause it exceeds your balance");
			throw new MyException();
		}
		else {
			accountBalance = accountBalance - withdraw;
		}
		return withdraw;
		
}
	public double getInterestRate() {
		return interestRate;
	}
	
	public double interest(double money) {
		double interest = money;
		interest = (interest/100) * accountBalance;
		accountBalance = accountBalance + interest;
		return interest;
		
	}	
	
	public String toString() {
		return accountName + " my account Number is " + accountNumber + " and my balance is " + accountBalance;
		
	}
	
}