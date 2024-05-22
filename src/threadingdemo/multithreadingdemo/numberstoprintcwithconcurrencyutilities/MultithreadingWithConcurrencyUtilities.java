package threadingdemo.multithreadingdemo.numberstoprintcwithconcurrencyutilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*
CountDownLatch: Can be used to make sure that a thread waits until other
                threads have completed a given task.

CyclicBarrier: Can be used to make a set of threads wait for
               each other to reach a common barrier point.

Semaphore:controls access to a shared resource through permits.
          to coordinate between threads.

*/
public class MultithreadingWithConcurrencyUtilities {
    public static void main(String[] args) {
        System.out.println("I am the main thread and my name is: " + Thread.currentThread().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphoreobj = new Semaphore(5); // Allow up to 5 threads to print simultaneously

        for (int i = 0; i < 100; i++) {
            Printer printer = new Printer(i, semaphoreobj);
            executorService.execute(printer);
        }

        executorService.shutdown();
    }
}
