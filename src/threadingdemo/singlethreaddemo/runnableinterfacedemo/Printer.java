package threadingdemo.singlethreaddemo.runnableinterfacedemo;

public class Printer implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello by the thread: "+Thread.currentThread().getName());
    }
}
