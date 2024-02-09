package java8;

public class TestThread {
    public static void main (String[] args) throws InterruptedException{
        Runnable r=()->{
            for (int i = 0; i < 10; i++) {//write a thread in a functional programming approach
                System.out.println(Thread.currentThread().getName()+" : "+i);
                try {
                    Thread.sleep(10);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        };
        Thread t1=new Thread(r);
        t1.start();
    }
}
