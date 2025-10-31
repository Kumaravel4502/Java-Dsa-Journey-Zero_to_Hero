package OOPS.Inheritance.MultipleInheritance;

interface A {
  default void   show(){
        System.out.println("A");
    }
}
interface B {
    default void   show(){
        System.out.println("B");
    }
}

 class C implements A,B {
    public void show(){
        System.out.println("C chooses to call A : ");
        A.super.show();
        System.out.println("C chooses to call B : ");
        B.super.show();
    }
}

 class Main{
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
    }
}
