package oop.thread.exercise;

public class Message {
    private String msg="";

//    public Message(String msg) {
//        this.msg = msg;
//    }

    public synchronized String getMsg() {
        try {
            wait();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return msg;
    }

    public synchronized void setMsg(String msg) {
        this.msg = msg;
        try {
            notify();
        }catch (Exception e){

        }


    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
