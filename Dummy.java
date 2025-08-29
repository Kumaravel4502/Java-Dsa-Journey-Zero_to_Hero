
import java.util.*;

class Dummy {

  

    public static void main(String[] args) {

        int nums[] = {4, 5, 6, 6, 6, 8, 7, 8, 9, 0, 1, 2};
        int target = 6;
        int ans[] = search(nums, target);
        System.out.println("Position of " + target + " is: " + ans);
        System.out.println("Total number of occurences of " + target + " is: " + ans);
    }

}
