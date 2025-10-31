package OOPS.Inheritance.MultipleInheritance;

interface kyc {
    void identity();
}

interface loan {
    void eligiblity();
}

class Bank implements kyc, loan {
    @Override
    public void identity() {
        System.out.println("Checking pan and Aadhar");
    }

    @Override
    public void eligiblity() {
        System.out.println("checking Loan Eligiblity");
    }
}

class User {
    public static void main(String[] args) {
        Bank ref = new Bank();
        ref.identity();
        ref.eligiblity();
    }
}
