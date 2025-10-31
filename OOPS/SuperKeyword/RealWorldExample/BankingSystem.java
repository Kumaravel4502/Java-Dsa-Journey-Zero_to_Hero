package OOPS.SuperKeyword.RealWorldExample;

// Base class
class Account {
    protected double Balance = 0;

    public void deposit(double amt) {
        Balance += amt;
    }

    public boolean withdraw(double amt) {
        if (amt <= Balance) {
            Balance -= amt;
            return true;
        } else {
            System.out.println("Insufficient balance to withdraw " + amt);
            return false;
        }
    }

    public double getBalance() {
        return Balance;
    }
}

// Subclass
class SavingsAccount extends Account {
    private double interestRate = 0.05;

    public void addInterest() {
        super.Balance = super.Balance + super.Balance * interestRate;
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.deposit(1000);
        System.out.println("After deposit: " + s.getBalance());


        if (!s.withdraw(500)) {
            return;
        }
        System.out.println("After withdrawal: " + s.getBalance());

        s.addInterest();
        System.out.println("After adding interest: " + s.getBalance());
    }
}
