package CollectionFramework.SoftSauve;

class Account {
    private int balance = 5000;

    synchronized void withdraw(int amt) {
        if(balance >= amt) {
            balance -= amt;
            System.out.println("Remaining: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
