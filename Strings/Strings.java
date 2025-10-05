public class Strings {
    public static void main(String[] args) {
        String Series="";
        for(int i=0;i<25;i++){
            char ch=(char)('A'+i);
            Series=Series+ch+" ";
        }
        System.out.println(Series+" ");
    }
}