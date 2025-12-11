package CollectionFramework.SoftSauve.QSP;

public class LengthOfString
{
    public static void main(String[] args) {
        String s="HELLO";
        int count=0;
        for(char c:s.toCharArray()){
            count++;
        }
        System.out.println("Length = "+count);
    }
}
