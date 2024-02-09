package collectionss;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TestDequeue {
    public static void main(String[] args) {
        //de has basic operation: 1. offer- add element from rear
        //2.poll- remove elelemt from front
        //3. peel- return first element but not remove from de
        // LinkedList stack= new LinkedList();
        Deque deque= new LinkedList();
        deque.offerFirst("chan");
        deque.offer("chris");
        deque.offerLast("kidist");
        deque.offerFirst("udey");
        deque.offerLast("vik");
        System.out.println("de "+deque);
        int len= deque.size();
        Object o=deque.peek();
        Object o1=  deque.peekFirst();
        Object o2=  deque.peekLast();
        Object o3=deque.pollFirst();
        Object o4= deque.pollLast();
        System.out.println("Peek element: "+deque);
        Object o5=deque.poll();
    }

}
