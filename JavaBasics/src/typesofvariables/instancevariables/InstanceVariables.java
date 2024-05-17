package typesofvariables.instancevariables;

public class InstanceVariables {

    //Declaring instance variables
    String name;
    int age;
    boolean workingStatus;

    public InstanceVariables(String name, int age, boolean workingStatus){

        //Initializing Instance variables
        this.name=name;
        this.age=age;
        this.workingStatus=workingStatus;
    }
    public void displayDetails(InstanceVariables obj){

        System.out.println("Employee Name: "+obj.name);
        System.out.println("Employee Age : "+obj.age);
        System.out.println("Employee workingStatus : "+obj.workingStatus);
        }

}
