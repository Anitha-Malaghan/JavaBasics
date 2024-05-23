package abstraction;

public class Dog extends Animal {
    //Implementation of abstract method in the child class
    @Override
    public void makeSound() {

        System.out.println("Bow Bow");
    }
}
