
// Poly-> many , Morphism -> Ways to Represent

package OOPS.Polymorphism;


class Shapes {
    void area() {
        System.out.println("Area in Shapes");
    }
}

class Circle extends Shapes {
    void area() {
        System.out.println("Circle in Shapes");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("Triangle in Shapes");
    }
}

class Rectangle extends Shapes {
    void area() {
        System.out.println("Rectangle in Shapes");
    }
}


public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        circle.area();
        triangle.area();
    }
}


