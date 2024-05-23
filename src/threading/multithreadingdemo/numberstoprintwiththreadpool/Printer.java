package threading.multithreadingdemo.numberstoprintwiththreadpool;

public class Printer implements Runnable{
    int numbersToPrint;
    public Printer(int numbersToPrint){
        this.numbersToPrint = numbersToPrint;
    }
    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName()+" : "+numbersToPrint);
    }
}
