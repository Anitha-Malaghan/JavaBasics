package threadingdemo.multithreadingdemo.numberstoprintforkjoinpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MultithreadingWithForkJoinPoolDemo {
    public static void main(String[] args){
        System.out.println("I am the first thread and my name is: "+Thread.currentThread().getName());

        // Creating a ForkJoinPool with parallelism level of 10
        ForkJoinPool forkJoinPoolObj = new ForkJoinPool(10);

        for(int i=0; i<100; i++){
            Printer printerObj = new Printer(i);
            forkJoinPoolObj.submit(printerObj);
        }
        forkJoinPoolObj.shutdown();

        /*
        To ensure that all tasks are executed before the program terminates,
        you should call forkJoinPoolObj.awaitTermination() after shutdown().
        This will make the main thread wait until all tasks have completed.
        */
        try {
            // Wait for all tasks to terminate
            forkJoinPoolObj.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
