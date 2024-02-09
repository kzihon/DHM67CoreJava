//package oop.thread.locks;
//
//public class TestDeadLock {
//   //TestDeadLock r1=new TestDeadLock();
//    //TestDeadLock r2=new TestDeadLock();
////    public synchronized void get(){
////        System.out.println("get runs");
////      //  r2.put();
////    }
////    public synchronized void put(){
////        System.out.println("put runs");
////      //  r1.get();
////    }
//    public static void main(String[] args) {
////    TestDeadLock r1=new TestDeadLock();
////    TestDeadLock r2=new TestDeadLock();
////
////    AB a1=new AB(r1,r2);
////    B a2 = new B(r1,r2);
//        final String a1="Chandra";
//        final String a2="Mahesh";
//
//    Thread t1= new Thread() {
//        public void run() {
//            System.out.println("Thead AB acquiring lock on al");
//            synchronized (a1) {
//                System.out.println("Thread AB acquires lock on a1");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                synchronized (a2) {
//                    System.out.println("Thread Ab tries to acquire lock of resource a2");
//                }
//                System.out.println(Thread.currentThread() + "completes");
//            }
//        }
//
//    Thread t2=new Thread() {
//
//
//            public void run() {
//                // TODO Auto-generated method stub
//                System.out.println("Thread B acquiring lock on a2");
//                synchronized(a2)
//                {
//                    System.out.println("Thread B acquired lock on a2");
//                    try
//                    {
//                        Thread.sleep(3000);
//                    }catch(InterruptedException e)
//                    {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Thread B acquiring lock on a1");
//                    synchronized(a1)
//                    {
//                        System.out.println("Thread B acquires lock on a1");
//                    }
//                    System.out.println("Thread B releases lock on a1");
//                }
//                System.out.println("Thread B releases lock on a2");
//                System.out.println(Thread.currentThread()+"completes");
//            }
//
//        };
//    t1.start();
//    t2.start();
//    }
//}
//
//
