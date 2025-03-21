package JavaBasics;

class SharedResources {
    private volatile boolean running = true; // Ensures visibility

    public void stop() {
        running = false; // Immediately visible to all threads
    }

    public void run() {
        while (running) { }
        System.out.println("Stopped!");
    }
}

public class VolatileKeywordDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResources resource = new SharedResources();

        Thread t1 = new Thread(resource::run);
        t1.start();

        Thread.sleep(1000);
        resource.stop(); // Now, t1 will see this change and exit
    }
}
