package oop.thread;

public class TheadSyncronization {
    public static void main(String[] args) {
        Account acc= new Account();
        AccountRunnable r= new AccountRunnable(acc);
        AccountRunnable2 r1= new AccountRunnable2(acc);
        Thread th1=new Thread(r);//withdrawal thread
        Thread th2=new Thread(r1);//deposit thread
        th1.start();
        th2.start();
//        try {
//            th1.join();
//            th2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Final Account Balance: "+acc.geBalance());


    }
}
