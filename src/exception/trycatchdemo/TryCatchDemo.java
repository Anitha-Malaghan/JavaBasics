package exception.trycatchdemo;

public class TryCatchDemo {
    public static void main(String[ ] args) {
        int[] myNumbers1 = {1, 2, 3};
        /*
          Exception in thread "main"
          java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
	      at exceptiondemo.Main.main(Main.java:6)
        */

        //System.out.println(myNumbers[10]); // error!

        /*
        we can use try...catch to catch the error and execute some code to handle it:
        */
        try {
            int[] myNumbers2 = {1, 2, 3};
            System.out.println(myNumbers2[10]);
        } catch (Exception e) {
            System.out.println("Error message was: "+e.getMessage());
        }
    }
}
