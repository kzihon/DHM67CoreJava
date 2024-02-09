//package oop.thread.locks;
//
//class AB implements Runnable {
//    TestDeadLock t1 = null;
//    TestDeadLock t2 = null;
//
//    public AB(TestDeadLock ob, TestDeadLock ob2) {
//        this.t1 = ob;
//        this.t2 = ob2;
//
//    }
//
//    @Override
//    public void run() {
//        synchronized (t1) {
//            t1.get();
//        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        synchronized (t1) {
//            t2.put();
//        }
//
//        System.out.println(Thread.currentThread() + "completes");
//    }
//}
