package oop.thread.locks;

public class AccountRunnable3 implements Runnable{

    Account2 acc;

    public AccountRunnable3(Account2 acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
      //  for(int i=0;i<5;i++){
//            System.out.println("Thead going to withdraw: "+Thread.currentThread().getName());
//            if(acc.geBalance()>10) {

            acc.withdraw(10);
//            System.out.println("Balance is: "+acc.geBalance());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            // System.out.println("Balance is: "+acc.geBalance());
//      }e
      //  }
    }
}
