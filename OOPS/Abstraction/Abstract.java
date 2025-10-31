package OOPS.Abstraction;

abstract class Computer {
    // I've created two abstract methods
    abstract void turnOn();

    abstract void turnOff(); //Declaration

}

class HP extends Computer {
    @Override
    void turnOn() {
        System.out.println("Turned On OOPS.Abstraction.HP ");
    }

    @Override
    void turnOff() {
        System.out.println("Turned Off OOPS.Abstraction.HP");
    }
}

class Dell extends Computer {
    @Override
    void turnOn() {
        System.out.println("Turned On OOPS.Abstraction.Dell ");
    }

    @Override
    void turnOff() {
        System.out.println("Turned Off OOPS.Abstraction.Dell");
    }
}


public class Abstract {
    public static void main(String[] args) {
        HP obj = new HP();
        obj.turnOn();
        obj.turnOff();
        Dell d = new Dell();
        d.turnOn();
        d.turnOff();
    }
}
