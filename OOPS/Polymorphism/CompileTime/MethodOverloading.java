package OOPS.Polymorphism;

//Compile-time Polymorphism: Java determines which method to call at compile time based on the number and type of arguments.

class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Numbers obj = new Numbers();

        // Print the results of the overloaded methods
        System.out.println("Sum of 2 numbers: " + obj.sum(5, 5));
        System.out.println("Sum of 3 numbers: " + obj.sum(10, 20, 30));
    }
}
