// 3. Access Parent Class Fields (Variable)

//Usage:
//If a child class has a variable with the same name as in parent, use super.variable to refer to
//the parent's version.

package OOPS.SuperKeyword;

class Animal3 {
    String Color = "White";
}

class Dog3 extends Animal3 {
    String Color = "Black";

    void PrintColor() {
        System.out.println("Dog3 Color : " + Color); // black (Current Class)
        System.out.println("Animal3 Color : " + super.Color); // white (Parent Class)
    }
}

public class AnimalBehaviour3 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.PrintColor();
    }
}
