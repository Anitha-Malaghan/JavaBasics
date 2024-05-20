package typesofvariables.finalvariales;

public class FinalVariable {

    //Declaring and initializing final variable @class level
    final String currentStatus ="Employee";

    //Declaring final variable @class level
    final boolean workPermit;

    public FinalVariable(){

        //Initializing final variable inside constructor
        workPermit= true;

    }
    public void displayDetails(){

        //Declaring final variable inside method
        final boolean maritalStatus =true;

        System.out.println("Employee currentStatus: "+currentStatus);
        System.out.println("Employee workPermit: "+workPermit);
        System.out.println("Employee maritalStatus: "+maritalStatus);
    }

}
