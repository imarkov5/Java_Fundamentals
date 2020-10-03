public class BankAccountIIController {
    public static void main(String[] args) {
		BankAccountII ba = new BankAccountII();
		ba.depositMoney(100.49, "checking");
		ba.depositMoney(3.00, "savings");
        ba.displayAccountBalance();
        
        BankAccountII ba1 = new BankAccountII();
        ba1.depositMoney(1000.49, "checking");
        ba1.depositMoney(500.99, "savings");
        ba1.displayAccountBalance();

        System.out.println(BankAccountII.totalHoldings);
        System.out.println("---------------------------------------------------");

		ba.withdrawMoney(50, "checking");
		ba.withdrawMoney(50, "savings");
        ba.displayAccountBalance();
        
        ba1.withdrawMoney(80.49, "checking");
        ba1.withdrawMoney(10.99, "savings");
        ba1.displayAccountBalance();

		System.out.println(BankAccountII.totalHoldings);
	}
}
