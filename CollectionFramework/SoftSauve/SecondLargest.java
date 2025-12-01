package CollectionFramework.SoftSauve;

public class SecondLargest {
    public static void main(String[] args) {
        int large = Integer.MIN_VALUE, SecondLarge = Integer.MIN_VALUE;
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                SecondLarge = large;
                large = arr[i];
            } else if (arr[i]>SecondLarge && arr[i]!=large) {
                SecondLarge=arr[i];
            }
        }
        System.out.println("Large: " + large);
        System.out.println("SecondLarge : " + SecondLarge);
    }
}
