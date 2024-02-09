package dsa;

import java.util.Stack;

public class cisco {
    public static void isOrdered(String str){
        int counter= 97;
      int  index=0;
       for(int i=0;i<str.length();i++){
           char x=str.charAt(i);
          // int num=Character.getNumericValue(x);
           if((x-counter)!=0){
               index=i+1;
               break;
           }
           counter++;
       }

        System.out.println(index);
    }
    public static void adjacent(String str){
        Stack<Character> s=new Stack<>();

        int i=0;
        while (i<str.length()){
            char x=str.charAt(i);
            if(s.isEmpty()){
                s.push(x);
            } else {
                check(s,x);
            }

            i++;
        }
        System.out.println(s.size());
    }
    public static void check( Stack<Character> s, Character c){
        if((c=='0') && (s.peek()=='1') || (c=='1') && (s.peek()=='0')){
            s.pop();
        }else {
            s.push(c);
        }
    }
    public static void main(String[] args) {
      //  adjacent("111000");
        isOrdered("abcip");
    }
}
