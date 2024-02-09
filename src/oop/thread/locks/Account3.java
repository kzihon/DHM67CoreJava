package oop.thread.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account3 {
    double acbal = 0;
    Lock l1= new ReentrantLock();
    Condition isDeposit= l1.newCondition();
    Condition isWithdraw=l1.newCondition();

    public void withdraw(double wamt) {
//    public void withdraw(double wamt){
        try {
            l1.lock();


        if (wamt > acbal) {
            System.out.println("Not Sufficent balance in the account: " + acbal);

            try {
               isDeposit.await();
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
    }catch(Exception e){

        }finally {
            l1.unlock();
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
        try {
            l1.lock();

            acbal=acbal+damt;
            try {
                isDeposit.signal();
            }catch (Exception e){

            }
        }catch (Exception e){

        }finally {
            l1.unlock();
        }

        System.out.println("Complete the deposit: "+damt+" Avilable: "+acbal);
    }
    public double geBalance(){

        return acbal;
    }


}
