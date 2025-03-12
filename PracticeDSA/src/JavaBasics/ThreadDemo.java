package JavaBasics;

public class ThreadDemo extends Thread{
    public void run(){
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
        ThreadDemo obj = new ThreadDemo();
        obj.start();
    }
}
