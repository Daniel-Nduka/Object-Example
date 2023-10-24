
public class BankTest {
	public static void main(String[] args) {
		
		People Nduka = new People ("Nduka", "M", 26);
		
		SavingsAccount NdukaFirstAccount = new SavingsAccount (Nduka);
		SavingsAccount NdukaSecondAccount = new SavingsAccount (Nduka);
		

		NdukaSecondAccount.deposit(900);
		NdukaSecondAccount.withdraw(1000);
		
		System.out.println(NdukaSecondAccount);
		
		
		SavingsAccount NdukaSaving = new SavingsAccount (Nduka);
		NdukaSaving.deposit(400);
		NdukaSaving.interest(10);
;		System.out.println(NdukaSaving);
	}
}
