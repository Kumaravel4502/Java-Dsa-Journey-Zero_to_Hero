package OOPS.Abstraction;

abstract class Addition{
    // OOPS.Abstraction.Abstract method
    public abstract void add(int a,int b);
    //Concrete method
    public  void sub(int a,int b){
        System.out.println("From Addition : "+(a+b));
    }
}

//Implementation class

class Manga extends Addition{
    @Override
    public void add(int a, int b) {
        System.out.println("From Manga : "+(a+b));
    }
}

public class Test {
    public static void main(String[] args) {
        Addition add=new Manga();
        add.add(45,10);
        add.sub(30,10);
    }
}
