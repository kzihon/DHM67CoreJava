package oop.thread.exercise;

public class TestMultOfSix {
    public static void main(String[] args) throws InterruptedException {
        MultipleOfSix mSix= new MultipleOfSix();
        MultOfSixRunnable mult=new MultOfSixRunnable(mSix);
        MultOfSixRunnable mult2=new MultOfSixRunnable(mSix);
        Thread t1= new Thread(mult);
        Thread t2= new Thread(mult2);
        t1.start();
        t2.start();



    }
}
