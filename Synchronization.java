
class Counter {
    private int count = 0;

    
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        
        Counter counter = new Counter();

      
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "Thread 2");

        
        thread1.start();
        thread2.start();
    }
}
