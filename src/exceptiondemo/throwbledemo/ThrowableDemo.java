package exceptiondemo.throwbledemo;

public class ThrowableDemo {
    public static void main(String[] args) {
        try {
            //Creates a new instance of CustomException with the message "Custom exception occurred" and throws it.
            throw new CustomException("Custom exception occurred");
        } catch (CustomException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Localized Message: " + e.getLocalizedMessage());
            System.out.println("ToString: " + e.toString());

            /*
            * Shows the detailed stack trace, including where the exception was thrown
              and the method call sequence leading to the exception.
            */
            System.out.print("Stack Trace: ");
            e.printStackTrace();
        }
    }
}

class CustomException extends Exception {
    /*
     a constructor that takes a message as a parameter and passes it to the superclass
     (Exception) constructor using super(message).
     */
    public CustomException(String message) {
        super(message);
    }

    @Override
    public String getLocalizedMessage() {
        // Customize the localized message: It adds the prefix "Localized message: " to the original message.
        return "Localized message: " + super.getMessage();
    }
}

