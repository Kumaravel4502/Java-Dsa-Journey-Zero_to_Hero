
// WAJP to remove duplicates from a String

package CollectionFramework.Set.LinkedHashSet;

//import java.util.LinkedHashSet;
//import java.util.Set;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        String s = "Hello Developers";
//        System.out.println("Duplicates : "+s);
//        Solve(s);
//    }
//
//    public static void Solve(String s) {
//        s = s.toLowerCase();
//        char [ ]ch=s.toCharArray();
//        Set<Character> ls=new LinkedHashSet<>();
//        for(char x:ch){
//            ls.add(x);
//        }
//        String  res="";
//        for (Character x:ls)
//            res+=x;
//        System.out.println("Removed Duplicates : "+res);
//
//
//
//    }
//}


//                     OR


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "Hello Developers";
        System.out.println("Original : " + s);
        System.out.println("After Removing Duplicates : " + removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        s = s.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder result=new StringBuilder();
        for(char c:set){
            result.append(c);
        }
        return result.toString();
    }
}
