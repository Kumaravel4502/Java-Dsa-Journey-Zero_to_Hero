
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The string : ");
        String name=s.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(rev.equalsIgnoreCase(name)){
            System.out.println(name+" is Palidrome");
        }
        else{
            System.out.println(name+" is Not a palindrome");
        }
    }
}
