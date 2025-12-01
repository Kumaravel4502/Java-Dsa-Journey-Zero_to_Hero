package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.offer(10);
        queue.offer(40);
        queue.offer(null);
        queue.offer("Hello");
        queue.offer(40);
        System.out.println(queue); //[10, 40, null, Hello, 40]
        System.out.println(queue.peek());// 10
        queue.poll();
        System.out.println(queue); // [40, null, Hello, 40]

    }
}
