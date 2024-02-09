package oop.thread.locks;

public class AccountRunnable6 implements Runnable{
    Account3 acc;

    public AccountRunnable6(Account3 acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
    //    for(int i=0;i<5;i++){
        acc.withdraw(10);
      //  }
    }
}
