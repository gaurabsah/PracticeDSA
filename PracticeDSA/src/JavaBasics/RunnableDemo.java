package JavaBasics;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        RunnableDemo obj = new RunnableDemo();
        Thread t1 = new Thread(obj);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("gaurab");
        }
    }
}
