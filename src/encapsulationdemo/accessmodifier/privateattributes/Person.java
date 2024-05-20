package encapsulationdemo.accessmodifier.privateattributes;

public class Person {
    private String name;
    private int age;

    //getter methods to retrieve and print the values of these variables
    public String getName() {

        return name;
    }

    //setter methods to assign values to the private variables
    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            // Simple validation
            this.age = age;
        }
    }

}
