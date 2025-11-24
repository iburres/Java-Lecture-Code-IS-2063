public class BankMain {
    public static void main(String[] args) {

        BankAccount acct = BankAccount.openWith(100);

        acct.deposit(50);

        acct.printIfAffordable(120);
        acct.withdraw(120);

        acct.printIfAffordable(50);
        acct.withdraw(50);

        acct.printSummary();
    }
}
