package oop.thread;

public class JoinRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread started: "+ Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println("Thread completed "+ Thread.currentThread().getName());
    }
}
