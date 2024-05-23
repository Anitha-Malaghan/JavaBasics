package inheritance.multipleinheritancedemo;

public class SubClass implements SuperClassA, SuperClassB{
    @Override
    public void method(){
        System.out.println("I am the subclass giving an existence to the method");
    }

}
