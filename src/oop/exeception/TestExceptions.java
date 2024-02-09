package oop.exeception;

import java.util.Scanner;

public class TestExceptions {
    public static void  division(){
        int result=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numerator");
        int num1=sc.nextInt();
        System.out.println("Enter demominator");
        int num2=sc.nextInt();//what ever line of code which create a problem should surround by try catch block
        try{
            result=num1/num2;
        }catch (ArithmeticException e){
          // System.out.println(e);
            e.printStackTrace();
        }finally {
            System.out.println("this will be executed wheather the program is executed grace fully or not");
        }

        System.out.println("Result: "+result);
    }



    public static void main(String[] args) {
        division();
        System.out.println("Main continues...");
    }
}
