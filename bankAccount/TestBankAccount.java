public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.showTotalDeposits();
        account1.withdrawChecking(101);
        account1.withdrawChecking(2000);
    }

}
