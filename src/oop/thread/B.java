package oop.thread;

public class B implements Runnable{
    @Override
    public void run() {
        for(int k=0;k<10;k++){
            System.out.println("Thread Name: "+Thread.currentThread().getName()+": "+k);
            try {
                Thread.sleep(1000);//we are posing a thread everytime wirh 10000 sec gap
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
