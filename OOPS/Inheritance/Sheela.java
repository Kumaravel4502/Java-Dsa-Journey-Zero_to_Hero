package OOPS.Inheritance;

// Child can access parent but parent can't access child

public class Sheela {
    static int id = 10;
}

class Mala extends Sheela {
    static int age = 25;

    public static void main(String[] args) {
        //Using chils Class Reference
        System.out.println("Mala class variable Mala age :" + Mala.age);
        System.out.println("Sheela class variable Mala id :" + Mala.id);

        //Using Parent Class Reference
        System.out.println("Sheela class variable Sheela id :" + Sheela.id);
        //  System.out.println("Mala class variable Sheela age :" + Sheela.age); // CTE
    }
}
