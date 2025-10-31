package OOPS.ClassCasting.UpCasting;

//UpCasting --> Converting Child class reference into Parent class reference

//Disadvantage of upcasting is we cannot access child class properties using parent class reference.

class Car {
}

class Auto extends Car {
}

class Mini extends Car {
}

class Luxury extends Car {
}


public class Test {
    public static void main(String[] args) {
//        Car x = new Auto();
//        System.out.println(x);
//        x = new Mini();
//        System.out.println(x);
//        x = new Luxury();
//        System.out.println(x);


        Car[] cars = {new Auto(), new Mini(), new Luxury()};

        for (Car c : cars) {
            System.out.println(c);
        }

    }
}





