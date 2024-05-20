package encapsulationdemo.accessmodifier.publicattributes.package1;

public abstract class Animal {
    //default instance variable
    public String name;
    public int legs=4;
    public abstract void walk();
    public abstract void eat();
    //Method in the same class
    public int numberOfLegs(){

        return legs;
    }

}
