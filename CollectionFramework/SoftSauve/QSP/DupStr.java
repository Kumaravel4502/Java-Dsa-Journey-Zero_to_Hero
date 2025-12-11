package CollectionFramework.SoftSauve.QSP;
import java.util.*;
/*
Input 1 : heelllo do you knoow
Output: hello do you know

 */
public class DupStr {
    public static void main(String[] args) {
        String s = "heelllo do you knoow";

        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0){
                res.append(s.charAt(i));
            }
            else {
                if(s.charAt(i)!=s.charAt(i-1)){
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString());
    }
}





//    public static void main(String[] args) {
//
//
//        String s = "heelllo do you knoow";
//
//        Set<Character> seen = new HashSet<>();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            char c = s.charAt(i);
//
//            // if not seen before → keep
//            if (!seen.contains(c)) {
//                result.append(c);
//                seen.add(c);
//            }
//            // otherwise skip (remove duplicate)
//        }
//
//        System.out.println(result.toString());
//    }
//}