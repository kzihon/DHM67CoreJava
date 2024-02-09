package collectionss;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestQueue {
    public static void main(String[] args) {
        //queue has basic operation: 1. offer- add element from rear
        //2.poll- remove elelemt from front
        //3. peel- return first element but not remove from queue
        // LinkedList stack= new LinkedList();
        Queue queue= new LinkedList();
        queue.offer("chan");
        queue.offer("chris");
        queue.offer("kidist");
        queue.offer("udey");
        queue.offer("vik");
        System.out.println("queue "+queue);
        int len= queue.size();
        Object o=queue.peek();
        System.out.println("Peek element: "+queue);
        Object o1=queue.poll();
    }







}
