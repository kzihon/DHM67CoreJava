package oop.thread.exercise;

public class MultipleOfSix {
    private int mult=1;

    public synchronized void multOfSix(int x){
        mult=6*x;
        System.out.println("6 * "+x +" = "+ mult);

    }

}
