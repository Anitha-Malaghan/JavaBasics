package encapsulationdemo.accessmodifier.defaultattributes.package1;

public abstract class Animal {
    //default instance variable
    String name;
    int legs=4;
    public abstract void walk();
    public abstract void eat();

    public int numberOfLegs(){
        return legs;
    }

}
