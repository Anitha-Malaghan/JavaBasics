package encapsulationdemo;

public class Main {
    public static void main(String[] args){
        Person personObj = new Person();
        /*
        java: name has private access in encapsulationdemo.Person
         */

        //personObj.name ="Anitha";

        /*
        java: name has private access in encapsulationdemo.Person
         */

        //System.out.println(personObj.name);

        personObj.setName("Anitha Malaghan");
        personObj.setAge(29);

        //Displaying person's details
        System.out.println("Name: "+personObj.getName());
        System.out.println("Age: "+personObj.getAge());
    }

}
