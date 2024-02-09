package oop.thread.exercise;

import oop.thread.Account;
import oop.thread.AccountRunnable;
import oop.thread.AccountRunnable2;

public class TestMessage {
    public static void main(String[] args) {
        Message msg= new Message();
        MsgConsumerRunnable r= new MsgConsumerRunnable(msg);
        MsgProducerRunnable r1= new MsgProducerRunnable(msg);
        Thread th1=new Thread(r);
        Thread th2=new Thread(r1);

        th2.start();
        th1.start();

    }
}
