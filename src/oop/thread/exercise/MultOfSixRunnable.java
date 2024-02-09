package oop.thread.exercise;

public class MultOfSixRunnable implements Runnable{
     MultipleOfSix multipleOfSix;

    public MultOfSixRunnable(MultipleOfSix multipleOfSix) {
        this.multipleOfSix = multipleOfSix;
    }

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            multipleOfSix.multOfSix(i);
        }

    }
}
