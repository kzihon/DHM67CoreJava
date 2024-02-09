//package oop.thread.locks;
//
//class A implements Runnable{
//    TestDeadLock t1= null;
//    TestDeadLock t2=null;
//
//    public A(TestDeadLock ob, TestDeadLock ob2){
//        this.t1=ob;
//        this.t2=ob2;
//
//    }
//
//    @Override
//    public void run() {
//        t1.get();
//        t2.get();
//    }
//}
