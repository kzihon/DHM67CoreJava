package oop.thread;

public class TestEvenThread {
    public static void main(String[] args) {
        int[] arr= new int[]{1,3,4,5,6,8};
        EvenThread evenThread= new EvenThread(arr);
        Thread thread= new Thread(evenThread);
        thread.start();

    }
}
