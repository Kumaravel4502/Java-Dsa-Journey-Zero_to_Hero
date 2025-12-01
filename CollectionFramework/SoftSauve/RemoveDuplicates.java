package CollectionFramework.SoftSauve;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 3, 3, 4};

        int j = 0;

        if (arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }


        System.out.println("Unique Elements : ");
        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
