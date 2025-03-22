package JavaBasics.thread;

public class ThreadLifeCycle extends Thread{
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t1 = new ThreadLifeCycle();
        System.out.println(t1.getState());    // NEW
        t1.start();
        System.out.println(t1.getState());    // RUNNABLE
        Thread.sleep(100);
        System.out.println(t1.getState());    // TIMED WAITING
        t1.join();
        System.out.println(t1.getState());    // TERMINATED

    }
}
