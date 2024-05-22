package threadingdemo.multithreadingdemo.numberstoprint;
/*
    uncontrolled thread creation can lead to
        resource exhaustion,
        increased overhead,
        and potential deadlocks or race conditions.

     Using thread pools, the ForkJoinPool, and concurrency utilities helps manage and mitigate these risks,
     ensuring efficient and safe concurrent execution.
 */
public class MultithreadingDemo {
    public static void main(String[] args){
        System.out.println("I am the main thread and my name is: "+Thread.currentThread().getName());


        for(int i=0; i<100; i++){
            Printer p = new Printer(i);
            Thread t  = new Thread(p);
            t.start();

        }
    }
}
