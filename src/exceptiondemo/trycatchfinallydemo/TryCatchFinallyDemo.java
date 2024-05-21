package exceptiondemo.trycatchfinallydemo;

public class TryCatchFinallyDemo {
    public static void main(String[] args){
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("getMessage method gave: "+e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
