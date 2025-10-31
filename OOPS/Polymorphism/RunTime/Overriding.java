package OOPS.Polymorphism.RunTime;


class Shapes {
    void area() {
        System.out.println("Area in Shapes");
    }
}

class Circle extends Shapes {
    // this will run when obj of Circle is created.
    // hence it is overriding the parent method
    @Override // this is called Annotation
    void area() {
        System.out.println("Circle in Shapes");
    }
}

class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("Triangle in Shapes");
    }
}

class Rectangle extends Shapes {
    @Override
    void area() {
        System.out.println("Rectangle in Shapes");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        rectangle.area();
    }
}



