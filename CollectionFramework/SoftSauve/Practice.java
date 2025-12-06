package CollectionFramework.SoftSauve;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
//        String s = "Kumaravel";
//        String rev = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev = rev + s.charAt(i);
//        }
//        System.out.println(rev);


        // 2
//
//        String name = "madam";
//        String rev = "";
//        for (int i = name.length() - 1; i >= 0; i--) {
//            rev += name.charAt(i);
//        }
//        if (name.equals(rev)) {
//            System.out.println("palindrome");
//        } else System.out.println("Not a Plaindrome");


//        String s="madam";
//        StringBuilder sb=new StringBuilder(s);
//        System.out.println(s.equals(sb.reverse().toString()));

        //   3


//        int arr[] = {10, 20, 30, 40, 50};
//        int large = Integer.MIN_VALUE, SecondLarge = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > large) {
//                SecondLarge = large;
//                large = arr[i];
//            } else if (arr[i] > SecondLarge && arr[i] != large) {
//                SecondLarge = arr[i];
//            }
//        }
//
//        if(SecondLarge==Integer.MIN_VALUE){
//            System.out.println("No Second Largest Found");
//        }
//        else{
//            System.out.println("large : "+large);
//            System.out.println("Second Large: "+SecondLarge);
//        }


        //  4

//   int a=-1,b=1,c;
//   for (int i=0;i<5;i++){
//       c=a+b;
//       System.out.println(c);
//       a=b;
//       b=c;
//   }


        // 5

//        String s = "banana";
//        int freq[] = new int[256];
//        for (char c : s.toCharArray()) {
//            freq[c]++;
//        }
//        System.out.println("Character frequency : ");
//        for (int i = 0; i < freq.length; i++) {
//            if (freq[i] > 0) {
//                System.out.println((char) i + " : " + freq[i]);
//            }
//        }
//


// 6


//        int arr[] = {5, 2, 8, 1, 3};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print("Sorted Array : ");
//        for (int num : arr) {
//            System.out.print(num+ " ");
//        }


        // 7
//
//        int num = 1234;
//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);


        // 8
//
//        int n = 12;
//        System.out.print("factors of 12 are : ");
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }


        String s = "Kumaravel";
        Map<Character, Integer> map = new HashMap<>();


     


    }
