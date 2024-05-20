package encapsulationdemo.accessmodifier.privateattributes;

/*
 Default instance variables are accessible in the following areas:
    - Anywhere inside the class

  Not accessible in the following areas:
    - Other classes in the same package
    - Child classes in the same package
    - Child classes in the other package
    -Anywhere
 */

public class Main {
    public static void main(String[] args){
        Person personObj = new Person();
        /* Private instance variables can't be accessed outside the class
        java: name has private access in encapsulationdemo.privateattributes.Person
         */

        //personObj.name ="Anitha";

        /*
        java: name has private access in encapsulationdemo.privateattributes.Person
         */

        //System.out.println(personObj.name);
            //To access private instance variables outside class you should use public getter and setter methods
        personObj.setName("Anitha Malaghan");
        personObj.setAge(29);

        //Displaying person's details
        System.out.println("Name: "+personObj.getName());
        System.out.println("Age: "+personObj.getAge());
    }

}
