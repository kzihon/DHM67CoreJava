package oop.thread.locks;

import oop.thread.Account;

public class AccountRunnable4 implements Runnable{
    Account2 acc;

    public AccountRunnable4(Account2 acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
    //    for(int i=0;i<5;i++){
        acc.deposit(20);
      //  }
    }
}
