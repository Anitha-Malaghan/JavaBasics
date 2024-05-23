package threading.multithreadingdemo.numberstoprintwiththreadpool;

import threading.multithreadingdemo.numberstoprint.Printer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
ExecutorService executorServiceObj = Executors.newFixedThreadPool(10);
Interface: ExecutorService
Interface: Executors
Method: newFixedThreadPool

 */
public class MultithreadingWithThreadPoolDemo {
    public static void main(String[] args){
        System.out.println("I am the main thread and my name is: "+Thread.currentThread().getName());

        ExecutorService executorServiceObj = Executors.newFixedThreadPool(10);

        for(int i=0; i<100; i++){
            //Creating an instance variable for the Printer class
            Printer printerObj = new Printer(i);
            //
            executorServiceObj.execute(printerObj);

        }
        executorServiceObj.shutdown();
    }
}
