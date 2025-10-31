package OOPS.Interface;

// Interface for abstraction
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Implementation class for Savings Account
class SavingsAccount implements BankAccount {
    // Encapsulation: private data member
    private double balance;

    // Constructor
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Implementing interface methods
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Implementation class for Current Account
class CurrentAccount implements BankAccount {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + 5000) { // Overdraft limit
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(2000);

        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Savings Balance: " + savings.getBalance());

        current.deposit(1000);
        current.withdraw(2500);
        System.out.println("Current Balance: " + current.getBalance());
    }
}
