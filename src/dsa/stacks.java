package dsa;

import java.util.Queue;
import java.util.Stack;

public class stacks {

    public static void isBalanced(String str){

        Stack<Character> stack1= new Stack<>();
        Stack<Character>stack2=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack1.push(str.charAt(i));
        }
        char x=' ';
        char y=' ';
        char k=' ';
        while(stack1.size()>0) {
            if (stack2.size() > 0) {
                x = stack1.peek();
                y = stack2.peek();
                boolean flag= matched(x,y);
                if (flag) {
                    stack1.pop();
                    stack2.pop();
                } else {
                    k = stack1.pop();
                    stack2.push(k);
                }
            } else {
                stack2.push(stack1.pop());
            }

        }
        if((stack1.size()==0) && (stack2.size()==0)){
            System.out.println("Balanced");
        }else System.out.println("Unbalanced");

    }
    public static boolean matched(char x, char y){
        char a='{';
        char b='}';
        char c='(';
        char d=')';
        char e='[';
        char f=']';
        if ((x==a )&&(y==b)) {
            return true;
        }else if((x==c)&&(y==d)){
            return true;
        } else if ((x==e)&&(y==f)) {
            return true;
        }
        return false;


    }
    public static void reverseWord(String word){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<word.length();i++){
            st.push(word.charAt(i));
        }
        for(int i=st.size()-1;i>=0;i--){
            System.out.print(st.pop());
        }

    }
    public static void reverseSentence(String sen){
        Stack<Character> st=new Stack<>();
        String[] strs=sen.split(" ");

        for(int i=0;i<sen.length();i++){
            if (sen.charAt(i) == ' ') {
                for(int j=st.size()-1;j>=0;j--){
                    System.out.print(st.pop());
                    if(j==0){
                        System.out.print(' ');
                    }
                }
            }else if(i==sen.length()-1){
                st.push(sen.charAt(i));

                for(int j=st.size()-1;j>=0;j--){
                    System.out.print(st.pop());
                }
            }else st.push(sen.charAt(i));
        }
    }
    public static void queue2stack(String word){
        Stack<Character> stack1= new Stack<>();
        Stack<Character>stack2=new Stack<>();

        for(int i=0;i<word.length();i++){
            stack1.push(word.charAt(i));
        }

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop());
        }




        }


    public static void main(String[] args) {
//        isBalanced("[()]{}{[()()]}");
//        isBalanced("[({{}})]");
//        isBalanced("{{()}");
       // reverseWord("hello");
       // reverseSentence("Hello World their lla a");
        queue2stack("Hello World their lla a");
    }
}
