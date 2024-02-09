package oop.thread.exercise;

public class MsgConsumerRunnable implements Runnable{
    private Message message;

    public MsgConsumerRunnable(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Consumer is Consuming a message...");
        System.out.println("Message: "+message.getMsg());
    }
}
