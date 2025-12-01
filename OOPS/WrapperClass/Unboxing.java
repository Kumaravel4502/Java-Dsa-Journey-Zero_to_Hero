package OOPS.WrapperClass;

public class Unboxing {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(10);//Boxing
        int ref1=i.intValue(); // Unboxing
        System.out.println("Unboxing : " +ref1);

        String str="12";
        int num=Integer.parseInt(str);
        System.out.println("String Multiply : "+num*2);
    }
}
