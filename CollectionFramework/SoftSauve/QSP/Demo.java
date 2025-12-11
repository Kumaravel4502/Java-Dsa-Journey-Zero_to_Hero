package CollectionFramework.SoftSauve.QSP;

public class Demo {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,5};
        int n=2,sum=0;
        for(int i=0;i< arr.length-n;i++){
            for (int j=i;j<i+n;j++){
                if(arr[j]<0){
                    sum+=arr[j];
                }
            }
        }
        System.out.println(sum);
    }
}
