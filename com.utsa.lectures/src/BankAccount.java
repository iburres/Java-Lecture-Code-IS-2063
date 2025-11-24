
public final class BankAccount {

    // Private internal state (never exposed directly)
    private double balance;

    // Controlled allocation
    private BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Starting balance must be non-negative.");
        }
        this.balance = initialBalance;
    }

    // Factory method: succinct allocation interface
    public static BankAccount openWith(double initialDeposit) {
        System.out.println("Opening new account with deposit: $" + initialDeposit);
        return new BankAccount(initialDeposit);
    }

    // Behavior: deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit failed: amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance recorded internally.");
    }

    // Behavior: withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Withdrawal failed: insufficient funds.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrew $" + amount + ". Transaction completed.");
    }

    // Behavior-based query (not a raw getter)
    public void printIfAffordable(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount <= balance) {
            System.out.println("You CAN afford $" + amount + ".");
        } else {
            System.out.println("You CANNOT afford $" + amount + ".");
        }
    }

    // Optional: user-facing summary (still not exposing raw fields)
    public void printSummary() {
        System.out.println("Account summary: balance securely stored; available for authorized transactions.");
    }
}
