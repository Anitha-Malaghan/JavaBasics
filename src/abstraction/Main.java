package abstraction;


public class Main {
    public static void main(String[] args){
        //Creating object of child class
        Animal dogObj = new Dog();

        dogObj.makeSound();
        dogObj.sleep();
    }
}
