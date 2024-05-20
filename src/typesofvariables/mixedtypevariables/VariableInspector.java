package typesofvariables.mixedtypevariables;

public class VariableInspector {

    //Declaring and initializing final variable @class level
    final String currentStatus ="Employee";

    //Declaring final variable @class level
    final boolean workPermit;

    //Declaring and initializing static variable @class level
    static String companyName = "Neosoft";

    //Declaring static variable @class level
    static int companyAge;

    //Declaring instance variables
    String name;
    int age;
    boolean workingStatus;
    public VariableInspector(String name, int age, boolean workingStatus){

        //Initializing final variable inside constructor
        workPermit= true;

        //Initializing static variable @constructor level
        //companyAge=25;

        //Error illigal start of expression
        //static int salary=10000;

        //Initializing Instance variables
        this.name=name;
        this.age=age;
        this.workingStatus=workingStatus;
    }
    public void displayDetails(VariableInspector obj){
        //Declaring final variable inside method
        final boolean maritalStatus =true;

        //Error illigal start of expression
        //static int salary=10000;

        //Initializing static variable @method level
        companyAge=25;

        System.out.println("Employee Name: "+obj.name);
        System.out.println("Employee Age : "+obj.age);
        System.out.println("Employee workingStatus : "+obj.workingStatus);
        System.out.println("Employee currentStatus: "+obj.currentStatus);
        System.out.println("Employee companyName: "+VariableInspector.companyName);
        System.out.println("Employee companyAge: "+VariableInspector.companyAge);
        System.out.println("Employee workPermit: "+workPermit);
        System.out.println("Employee maritalStatus: "+maritalStatus);
    }

}
