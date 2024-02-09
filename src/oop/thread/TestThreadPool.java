package oop.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
       // ExecutorService es=Executors.newFixedThreadPool(5);
        //ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newSingleThreadExecutor();
        B ob= new B();
        es.execute(ob);
        es.execute(ob);
        es.execute(ob);
        es.execute(ob);
        es.execute(ob);
        es.execute(ob);
    }
}
