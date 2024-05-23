package threading.multithreadingdemo.numberstoprintforkjoinpool;

import java.util.concurrent.RecursiveAction;

public class Printer extends RecursiveAction{
    int numberToPrint;
    public Printer(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void compute(){
        System.out.println(Thread.currentThread().getName()+": "+numberToPrint);
    }
}
