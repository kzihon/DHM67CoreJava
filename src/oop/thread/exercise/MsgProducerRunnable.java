package oop.thread.exercise;

public class MsgProducerRunnable implements Runnable{
    private Message message;

    public MsgProducerRunnable(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Producer is producing a message");
        message.setMsg("Hello form producer");
    }
}
