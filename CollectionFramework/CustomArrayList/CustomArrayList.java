package CollectionFramework.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(60);

//        for(int ls  :list){
//            System.out.println(ls*2);
//        }

        System.out.println("List  : " + list);
        list.remove(1);
        System.out.println(list);
    }
}
