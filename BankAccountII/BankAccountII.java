import java.util.Random;
public class BankAccountII {
	// static things
	public static int numAccounts = 0;
	public static double totalHoldings = 0;
    
    private static String generateId() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}

	// object things
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;

	public BankAccountII() {
		BankAccountII.numAccounts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccountII.generateId();
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
    }
    
    public String getAcctNumber(){
        return this.accountNumber;
    }

	public void depositMoney(double amount, String account) {
		if(account.equals("savings"))
			this.savingsBalance += amount;
		else if(account.equals("checking"))
			this.checkingBalance += amount;
		BankAccountII.totalHoldings += amount;
	}

	public void withdrawMoney(double amount, String account) {
		boolean successful = false;
		if(account.equals("savings")) {
			// check if enough in account
			if(this.savingsBalance - amount >= 0) {
				successful = true;
				this.savingsBalance -= amount;
			}
		}
		else if(account.equals("checking")) {
			// check if enough in account
			if(this.checkingBalance - amount >= 0) {
				successful = true;
				this.checkingBalance -= amount;
			}
		}
		if(successful) {
			BankAccountII.totalHoldings -= amount;
		}
	}

	public void displayAccountBalance() {
		// %.2f formats decimal to the 10s place (like for moniez)
		System.out.println(String.format("Acct#: %s, Savings: %.2f, Checking: %.2f", this.accountNumber, this.savingsBalance, this.checkingBalance));
	}
}