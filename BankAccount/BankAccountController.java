public class BankAccountController {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new BankAccount();
        BankAccount acct3 = new BankAccount();
        System.out.println(BankAccount.numberOfAccounts);
        
        acct1.depositToChecking(1000.00);
        acct1.depositToSavings(500.00);
        acct1.depositToChecking(2000.00);
        acct1.depositToSavings(500.00);
        System.out.println(acct1.getCheckingBalance());
        System.out.println(acct1.getSavingsBalance());
        System.out.println(acct1.TotalMoney());
    }
}
