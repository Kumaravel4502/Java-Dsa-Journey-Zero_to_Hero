package CollectionFramework.SoftSauve;

public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String s="abcabcadef";
        String Longest="";
     for(int i=0;i<s.length();i++){
         for (int j=i+1;j<s.length();j++){
             String sub=s.substring(i,j);
             if(s.indexOf(sub,j)!=-1){
                 if(sub.length()>Longest.length()){
                     Longest=sub;
                 }
             }
         }
     }
        System.out.println(Longest);
    }
}
