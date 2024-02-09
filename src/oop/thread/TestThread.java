package oop.thread;

public class TestThread {
    public static void main(String[] args) {
        A ob= new A();//this a instacne is a thread
        A ob1= new A();
        //ob.run()
        //calling run menthpd here, makes the main thread will run it so use ob.run
        ob.start();
        ob1.start();//, depening the processor avilibliity, the thread proority will be differenct, so we can't rely on that
        System.out.println(ob.getPriority());
        System.out.println(ob1.getPriority());//when we dob't assigned any priority to a thread, then it gets default prority that assigned to its parent thread(here main thread)
        //main thread oriourty is 5
        //we can set prority to a thread but we shall not rely on that since it depends on the the os. the wich one will lound
    }
}
