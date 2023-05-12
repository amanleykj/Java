
public class BankAccount {


    private double checkingBalance = 100;
    private double savingsBalance = 100;
    private int accountNumber;
    public static int numberOfAccounts;
    public static int totalDeposits;

    public BankAccount(){
        numberOfAccounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void depositChecking(double amount) {
        amount += checkingBalance;
    }

    public void depositSavings(double amount) {
        amount += savingsBalance;
    }

    public void withdrawChecking(double amount) {
        if(checkingBalance > amount){
            System.out.println("I'm sorry but you don't have the funds for that.");
        }
        else{
            amount -= checkingBalance;
            System.err.println(String.format("You now have %f in your account", amount));
        }
    }

    public void withdrawSavings(double amount) {
        if(savingsBalance > amount){
            System.out.println("I'm sorry but you don't have the funds for that.");
        }
        else{
            amount -= savingsBalance;
            System.out.println(String.format("Thank you. Your new balance is %f", amount));

        }
    }

    public void showTotalDeposits() {
        double totalDeposits = getCheckingBalance() + getSavingsBalance();
        System.out.println(String.format("You have a total of %f in your accounts", totalDeposits));
    }

    
}