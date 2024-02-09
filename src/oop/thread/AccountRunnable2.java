package oop.thread;

public class AccountRunnable2 implements Runnable{
    Account acc;

    public AccountRunnable2(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
    //    for(int i=0;i<5;i++){
        acc.deposit(20);
      //  }
    }
}
