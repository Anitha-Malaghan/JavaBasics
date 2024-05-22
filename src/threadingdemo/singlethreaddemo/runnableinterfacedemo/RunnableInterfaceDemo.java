package threadingdemo.singlethreaddemo.runnableinterfacedemo;

public class RunnableInterfaceDemo{
    public static void main(String[] args){
        System.out.println("I am the first thread and my name is: "+Thread.currentThread().getName());

        //Create an object for the class Printer
        Printer printerObj = new Printer();

        //Create thread object for printerObj
        Thread t = new Thread(printerObj);

        //Starting the thread with start method
        t.start();
    }

}
