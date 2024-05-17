package typesofvariables.parametervariable;

public class ParameterVariable {
    public void printMessage(String message) {
        // Attempting to change the value of the parameter variable
        message = "New message"; // This will not change the original value passed to the method
        System.out.println("Inside printMessage method: " + message);
    }
}
