package CollectionFramework.SoftSauve;

class Bank {
    float rateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float rateOfInterest() {
        return 6.5f;
    }
}

class ICIC extends Bank {
    float rateOfInterest() {
        return 7.0f;
    }
}

public class PolyEG {
    public static void main(String[] args) {
        Bank b1=new SBI();
        Bank b2=new ICIC();
        System.out.println(b1.rateOfInterest());
        System.out.println(b2.rateOfInterest());
    }
}
