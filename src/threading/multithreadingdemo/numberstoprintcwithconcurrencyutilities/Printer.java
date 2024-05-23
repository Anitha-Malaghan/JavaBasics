package threading.multithreadingdemo.numberstoprintcwithconcurrencyutilities;

import java.util.concurrent.Semaphore;

public class Printer implements Runnable{
    private final int number;
    private final Semaphore semaphore;

    public Printer(int number, Semaphore semaphore) {
        this.number = number;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); // Acquire a permit before printing
            System.out.println("Printing: " + number + " by " + Thread.currentThread().getName());
            // Simulate some processing time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit after printing
        }
    }
}

