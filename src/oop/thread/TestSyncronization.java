package oop.thread;

public class TestSyncronization {
    public static void main(String[] args) {
        Account ob= new Account();
        AccountRunnable acr=new AccountRunnable(ob);

        Thread th1=new Thread(acr);
        Thread th2=new Thread(acr);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Account Balance: "+ob.geBalance());

    }
}
