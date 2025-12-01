package OOPS.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int a=5;
        int b=0;
      try {
//          int c=a/b;
          throw new Exception("Just for fun");
      }
      catch (ArithmeticException e){
          System.out.println(e.getMessage());
      }
      catch (Exception e){
          System.out.println("Normal Exception");
      }
      finally {
          System.out.println("It will always exectue");
      }

    }

    static int divide(int a,int b)throws ArithmeticException{
        if(b==0) {
            System.out.println();
        }
        return a;
    }

}
