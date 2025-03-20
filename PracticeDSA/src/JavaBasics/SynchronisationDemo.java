package JavaBasics;
class Counter{
    private int count;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class SynchronisationDemo extends Thread{
    private Counter counter;

    public SynchronisationDemo(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            counter.increment();
        }

    }

    public static void main(String[] args) {
        Counter count = new Counter();
        SynchronisationDemo t1 = new SynchronisationDemo(count);
        SynchronisationDemo t2 = new SynchronisationDemo(count);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(count.getCount());
    }
}
