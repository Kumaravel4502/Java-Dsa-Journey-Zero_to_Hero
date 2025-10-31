// Downcasting is the process of converting parent class reference into child class reference.
// Downcasting is not done by the compiler implicitly programmer has to do it explicitly using typecast operator

package OOPS.ClassCasting.DownCasting;


class Cab {
}

class Auto extends Cab {
    int price = 10;
}

class Mini extends Cab {
    int price = 15;
}

class Luxury extends Cab {
    int price = 20;
}


public class Test {
    public static void main(String[] args) {
        //UpCasting --> Converting Child class reference into Parent class reference
        Cab x = new Auto();
        // System.out.println(x.price);//CTE
        // Downcasting is the process of converting parent class reference into child class reference.
        Auto y = (Auto) x;
        System.out.println(y.price);//10


    }
}
