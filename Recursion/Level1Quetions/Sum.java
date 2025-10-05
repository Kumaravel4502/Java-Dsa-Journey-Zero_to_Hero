package Recursion.Level1Quetions;

public class Sum {
    public static void main(String[] args) {
        int res=sumOf(5);
        System.out.println(res);
    }
    static int sumOf(int n){
        if(n<=1){
            return 1;
        }

        return n+sumOf(n-1);
    }
}
