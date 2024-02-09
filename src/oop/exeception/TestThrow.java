package oop.exeception;

public class TestThrow {
    //throw is a statment to tell the runtime to throw a
    // specific type of excepiption by the programmer/ allow you to throw your own exceptions
    public static void main(String[] args) throws NegativeDiveException {
        int div=0;
        int i=3;
        int  j=8;
        if(j<0){
           // throw new ArithmeticException();
            throw new NegativeDiveException("Denominator can't be negative");
        }else{
            System.out.println(i/j);
        }
    }

}
