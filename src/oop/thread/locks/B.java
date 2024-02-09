//package oop.thread.locks;
//
//class B implements Runnable {
//    TestDeadLock t1 = null;
//    TestDeadLock t2 = null;
//
//    public B(TestDeadLock ob, TestDeadLock ob2) {
//        this.t1 = ob;
//        this.t2 = ob2;
//
//    }
//
//    @Override
//    public void run() {
//        synchronized (t2) {
//            t2.get();
//        }
//        synchronized (t1) {
//            t1.put();
//        }
//
//        System.out.println(Thread.currentThread() + "completes");
//    }
//}
