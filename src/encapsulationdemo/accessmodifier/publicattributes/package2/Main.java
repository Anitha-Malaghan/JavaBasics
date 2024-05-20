package encapsulationdemo.accessmodifier.publicattributes.package2;

import encapsulationdemo.accessmodifier.publicattributes.package1.Animal;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous subclass of Animal to instantiate it
        Animal dogAnimal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Dog is walking");
            }

            @Override
            public void eat() {
                System.out.println("Dog is eating");
            }
        };

        /*dogAnimal.walk();
        dogAnimal.eat();*/

        Dog dogObj1 = new Dog();
        dogObj1.numberOfLegs(dogAnimal);
    }
}

