package oop.interfaces;

public class FinalDemo {
    public final int a=23;
    public static final int b=25;


    public FinalDemo(){
     //   a=25;
    }
    public void get(){
        //a=43; //this can't assign value to a final variable
        System.out.println("a: ");
    }
}
