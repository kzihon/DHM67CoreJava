package oop.thread;

public class AccountRunnable implements Runnable{

    Account acc;

    public AccountRunnable(Account acc) {
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
