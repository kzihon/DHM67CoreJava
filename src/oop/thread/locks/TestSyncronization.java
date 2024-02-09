package oop.thread.locks;

import oop.thread.Account;
import oop.thread.AccountRunnable;

public class TestSyncronization {
    public static void main(String[] args) {
        Account3 ob= new Account3();
//        AccountRunnable3 acr=new AccountRunnable3(ob);
//        AccountRunnable4 acr2=new AccountRunnable4(ob);
        AccountRunnable5 acr=new AccountRunnable5(ob);
        AccountRunnable6 acr2=new AccountRunnable6(ob);

        Thread th1=new Thread(acr);
        Thread th2=new Thread(acr2);
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
