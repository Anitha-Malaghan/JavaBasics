package encapsulationdemo.interfacedemo;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("bow bow");
    }
}
