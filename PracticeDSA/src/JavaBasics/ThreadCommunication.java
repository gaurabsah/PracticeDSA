package JavaBasics;
class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void put(int value) {
        while (available) {
            try {
                wait(); // Wait if data is already available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer
    }

    public synchronized int get() {
        while (!available) {
            try {
                wait(); // Wait if no data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer
        return data;
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.put(i);
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.get();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
