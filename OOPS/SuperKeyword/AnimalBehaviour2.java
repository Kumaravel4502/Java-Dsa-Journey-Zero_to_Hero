// 2. Access Parent Class Method

package OOPS.SuperKeyword;

class Animal2 {
    void Sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog2 extends Animal2 {
    void Sound() {
        super.Sound(); // calls Animal2 Sound
        System.out.println("Dog2 Barks");
    }
}

public class AnimalBehaviour2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.Sound();
    }
}
