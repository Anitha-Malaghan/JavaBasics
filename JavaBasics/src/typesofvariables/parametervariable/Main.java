package typesofvariables.parametervariable;

public class Main {

    public static void main(String[] args) {
        ParameterVariable obj = new ParameterVariable();
        String originalMessage = "Original message";
        System.out.println("Before calling printMessage method: " + originalMessage);
        obj.printMessage(originalMessage); // Call the method with originalMessage
        System.out.println("After calling printMessage method: " + originalMessage);
    }
}
