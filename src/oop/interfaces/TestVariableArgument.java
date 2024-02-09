package oop.interfaces;
//import static java.lang.System;
public class TestVariableArgument implements Cloneable{
    public void add (int a, int b){
        System.out.println(a+b);
    }
    public void add (int a, int b, int c){
        System.out.println(a+b + c);
    }
    public void add (int ... a){// int ... a=int a[] ->dynamic length
         for(int value: a){
            System.out.print(value +"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) throws CloneNotSupportedException {//(String ... args) = (String[] args)
        TestVariableArgument ob= new TestVariableArgument();
        ob.add(12);
        ob.add(12, 36);
        ob.add(12,99,89);
        ob.add(12,89,98,98,78);
        System.out.println(ob.clone());

       // println()
    }
}

