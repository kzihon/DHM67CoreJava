package oop.thread.locks;

public class Account2 {
    double acbal = 0;

    public void withdraw(double wamt) {
//    public void withdraw(double wamt){
        synchronized (this) {//on which object you are locking
            if (wamt > acbal) {
                System.out.println("Not Sufficent balance in the account: " + acbal);

                try {
                    wait();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                acbal = acbal - wamt;
            }
        }
        System.out.println("withdrawak completed");

    }


//        if(acbal<amt){
//           // acbal=acbal-amt;
//            System.out.println("No more fund to withdraw");
//       //     System.out.println("balance is: "+acbal);
//        }else {
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            acbal=acbal-amt;
//            System.out.println("withdrawak completed");
//           // System.out.println("Available balance "+geBalance());
//        }


    public synchronized void deposit(double damt){
        synchronized (this){
            acbal=acbal+damt;
            try {
                notify();
            }catch (Exception e){

            }
        }

        System.out.println("Complete the deposit: "+damt+" Avilable: "+acbal);
    }
    public double geBalance(){

        return acbal;
    }


}
