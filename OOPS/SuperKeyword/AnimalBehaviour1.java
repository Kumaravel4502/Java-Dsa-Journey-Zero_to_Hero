// 1 . Accessing Parent Class constructor

package OOPS.SuperKeyword;

class Animal {
    Animal(String Name) {  // Parameterized constructor
        System.out.println(Name + " Animal is called");
    }

    Animal() { // Default constructor
        System.out.println(" Animal is called");
    }
}

class Dog extends Animal {
    Dog() {
//        super("Jimmy");//calls Animal Constructor // when we use super() it calls the constructor with Arguments
//        If we don't use the parameterized it calls the Default constructor
        System.out.println("Dog is called");
    }
}

public class AnimalBehaviour1 {
    public static void main(String[] args) {
        Dog d = new Dog();//Trigger All Constructor

    }
}


// for Super() with no  arguments
//output :
// Animal is called
//Dog is called


// For Super("Jimmy") with Arguments
//Output :
//Jimmy Animal is called
//Dog is called