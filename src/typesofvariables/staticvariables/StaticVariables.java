package typesofvariables.staticvariables;

public class StaticVariables {


    //Declaring and initializing static variable @class level
    static String companyName = "Neosoft";

    //Declaring static variable @class level
    static int companyAge;

    static int customerRetentionRate;


    public StaticVariables(int companyAge){

         /*Declaring and initializing static variable inside Constructor
            lead to: Error illigal start of expression */

        //static int salary=10000;


        //Initializing static variable @constructor level
        companyAge=this.companyAge;


    }
    public void displayDetails(StaticVariables obj){

        /* Declaring and initializing static variable inside method
        lead to: Error illigal start of expression

        static int salary=10000; */

        //Initializing static variable @method level
        customerRetentionRate=85;





        System.out.println("Employee companyName: "+ StaticVariables.companyName);
        System.out.println("Employee companyAge: "+ StaticVariables.companyAge);
        System.out.println("Employee companyAge: "+ StaticVariables.companyAge);

    }

}