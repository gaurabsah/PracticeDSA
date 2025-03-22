package JavaBasics.thread;

public class ThreadMethods extends Thread{
    public void run(){
        System.out.println("run method - JVM Calls it");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
            Thread.sleep(1000);  // current thread to sleep for specific time
//                Thread.yield();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
//        t1.setDaemon(true);
        t1.start();
        t1.join();
        ThreadMethods t2 = new ThreadMethods();
        t2.start();
        t2.join();

        System.out.println();
    }
}
