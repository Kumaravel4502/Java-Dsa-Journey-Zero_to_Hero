
// WAJP to create a collection of cookies and check the cookies enter by the user is correct or not

package CollectionFramework.CustomArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchCookies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList cookies = new ArrayList<>();
        cookies.add("Parle-G");
        cookies.add("Hide and seek");
        cookies.add("Bourbon");
        cookies.add("Good-Day");
        System.out.println("Enter the cookies to Search : ");
        String name=s.nextLine();
        if(cookies.contains(name)){
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
}
