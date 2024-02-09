package dsa;

import java.util.LinkedList;
import java.util.Stack;

public class Jpmc2 {
    public static void unifocal(int x) {
        String y = "" + x;
        boolean unifo = true;
        for (int i = 0; i < y.length() - 1; i++) {
            int diff = Math.abs(y.charAt(i) - y.charAt(i + 1));
            if (diff != 1) {
                unifo = false;
                break;
            }
        }

        System.out.println(unifo);
    }

    public static void appManager(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String[] a;
            String instruc;
            String val;
            if (arr[i].contains(" ")) {
                a = arr[i].split(" ");
                instruc = a[0];
                val = a[1];
            } else {
                instruc = arr[i];
                val = "";
            }


            if (instruc.equals("open")) {
                stack.push(val);
            } else if (instruc.equals("close")) {
                int x = Integer.parseInt(val);
                while (x > 0 && !stack.isEmpty()) {
                    stack.pop();
                    x--;
                }
            } else if (instruc.equals("clear")) {
                stack.clear();
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void minMoves(int[]a1,int[] a2){
        for (int i=0;i<a1.length;i++){
            int x=a1[i];
            int y=a2[i];
            int count=0;
            while (x>0 && y>0){
                int k=x%10;
                int l=y%10;
                count+=Math.abs(k-l);

                x=x/10;
                y=y/10;
            }
            System.out.println("Max moves needed to match "+a1[i]+" and "+a2[i]+" is "+count);
        }

    }

    public static void main(String[] args) {
        //unifocal(7876);
        //unifocal(90869);
        String[] str = new String[]{"open firefox", "open word", "close 1", "open chrome"};
      //  appManager(str);
       int[]a1= new int[]{123,543};
       int []a2= new int[]{321,279};
       minMoves(a1,a2);

    }
}
