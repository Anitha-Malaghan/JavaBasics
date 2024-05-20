package encapsulationdemo.accessmodifier.protectedattributes.package1;

public abstract class Animal {
    //default instance variable
    protected String name;
    protected int legs=4;
    public abstract void walk();
    public abstract void eat();

    public int numberOfLegs(){

        return legs;
    }

}
