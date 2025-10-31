abstract class Computer {
    // I've created two abstract methods
    abstract void turnOn();

    abstract void turnOff(); //Declaration

}

class HP extends Computer {
    @Override
    void turnOn() {
        System.out.println("Turned On HP ");
    }

    @Override
    void turnOff() {
        System.out.println("Turned Off HP");
    }
}

class Dell extends Computer {
    @Override
    void turnOn() {
        System.out.println("Turned On Dell ");
    }

    @Override
    void turnOff() {
        System.out.println("Turned Off Dell");
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
