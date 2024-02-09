package collectionss;

//import java.util.*;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
       // LinkedList stack= new LinkedList();
        Stack stack= new Stack<>();
       stack.push("chan");
       stack.push("chris");
       stack.push("kidist");
       stack.push("udey");
       stack.push("vik");
        System.out.println("stack "+stack);
       int len= stack.size();
        for (int i = 0; i < len; i++) {
            if(!stack.isEmpty()){
                stack.pop();
                System.out.println("stack after: "+stack);
            }

        }



    }
}
