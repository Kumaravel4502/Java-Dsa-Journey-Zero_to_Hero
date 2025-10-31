package OOPS.AnonymsClass;

// A class which does not have any Name is called Anonyms class..

interface Qspiders {
    void teach();
}

interface Jspiders {
    void teach();
}

public class Trainer {
    public static void main(String[] args) {
        Qspiders qsp = new Qspiders() {
            @Override
            public void teach() {
                System.out.println("Qspides Teaching Java");
            }
        };
        qsp.teach();

        Jspiders jsp = new Jspiders() {
            @Override
            public void teach() {
                System.out.println("Jspiders Teaching SQL");
            }
        };
        jsp.teach();
    }
}
