package oop.thread;

public class EvenThread implements Runnable{
    private int[] arr;
    public EvenThread(int[] arr){
        this.arr=arr;
    }
    @Override
    public void run() {//it will give you a thread of execution form your class
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

    }
}
