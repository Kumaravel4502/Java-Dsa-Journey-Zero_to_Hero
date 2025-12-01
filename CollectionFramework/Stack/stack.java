package CollectionFramework.Stack;

import CollectionFramework.GetIndex.Index;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> bag = new Stack<>();
        bag.push(10);
        bag.push(30);
        bag.push(40);
        bag.push(50);
        System.out.println(bag);//[10,30,40,50]
        bag.pop();
        System.out.println(bag);  //[10,30,40]
        System.out.println(bag.isEmpty());
        System.out.println(bag.search(30));
    }
}
