import java.util.Random;

public class BankAccount {
    private int acctNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts;
    private static double totalAmountOfMoney;

    private int generateRandomAcctNumber(){
        int n = 10000 + new Random().nextInt(90000); // 10000 ≤ n ≤ 99999
        System.out.println(n);
        return n;
    }
    public BankAccount(){
        this.acctNumber = generateRandomAcctNumber();
        numberOfAccounts ++; 
    }

public double getCheckingBalance(){
    return checkingBalance;
}
public double getSavingsBalance(){
    return savingsBalance;
}
public void depositToChecking(double depositAmount){
    this.checkingBalance += depositAmount;
}
public void depositToSavings(double depositAmount){
    this.savingsBalance += depositAmount;
}
public void withdrawFromChecking(double withdrawalAmount){
    if (this.checkingBalance >= withdrawalAmount){
        this.checkingBalance -= withdrawalAmount;
    }else{
        System.out.println("Insufficient funds!");
    }
}
public void withdrawFromSavings(double withdrawalAmount){
    if(this.savingsBalance >= withdrawalAmount){
        this.savingsBalance -= withdrawalAmount;
    } else {
        System.out.println("Insufficient funds!");
    }
}
public double TotalMoney(){
    double total = this.checkingBalance + this.savingsBalance;
    return total;
}



}
