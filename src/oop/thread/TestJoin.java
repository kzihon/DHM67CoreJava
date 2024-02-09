package oop.thread;

public class TestJoin {
    public static void main(String[] args) {
        JoinRunnable ob = new JoinRunnable();
        Thread th1 = new Thread(ob); //New State
        Thread th2 = new Thread(ob);//New State
        th1.start();
        try {
            th1.join();
            //main thread will be moved to wating state due to join call by th1.
            // Main will be wating for th1 to complete.
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th2.start();//we are controlling the scheudler indirectly
        try {
            th2.join();
            //main thread will be moved to wating state due to join call by th2.
            // Main will be wating for th1 to complete.
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main completed.");
    }
}
