package CollectionFramework.SoftSauve.QSP;

public class Demo2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=2;
        for(int i=0;i< arr.length-n;i++){
            for (int j=i;j<i+n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println("---------");
        }
    }
}
