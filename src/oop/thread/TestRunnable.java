package oop.thread;

public class TestRunnable {
    public static void main(String[] args) {
        B ob1=new B();
        Thread th1=new Thread(ob1);
        th1.start();
    }
}
