package oop.thread;

public class A extends Thread{

    private int i=5;
    @Override
    public void run(){
        //super.run()
        for(int k=0;k<10;k++){
            System.out.println("Thread Name: "+Thread.currentThread().getName()+": "+k);
        }
    }
}
