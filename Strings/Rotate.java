package Strings;

public class Rotate {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        String combined=str1+str1;
        System.out.println(combined.contains(str2));
    }
}
