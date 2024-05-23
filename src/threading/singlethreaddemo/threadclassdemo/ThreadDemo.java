package threading.singlethreaddemo.threadclassdemo;

public class ThreadDemo {
    public static void main(String[] args){
        System.out.println("I am the first thread. My name is: "+Thread.currentThread().getName());

        //Creating an object for the MyThread class
        MyThread myThreadObj = new MyThread();

        // Creating thread object for myThreadObj
        Thread t = new Thread(myThreadObj);

        //Starting the thread with start method
        t.start();

    }
}
