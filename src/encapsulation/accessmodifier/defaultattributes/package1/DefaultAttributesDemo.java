package encapsulation.accessmodifier.defaultattributes.package1;

/*
 Default instance variables are accessible in the following areas:
    - Anywhere inside the class
    - Other classes in the same package
    - Child classes in the same package
  Not accessible in the following areas:
    - Child classes in the other package(Refer package 2 with walk() in the Tiger class
    -Anywhere
 */

public class DefaultAttributesDemo {
    public static void main(String[] args){
        Cat catObj = new Cat();
        catObj.walk();
        catObj.eat();
    }
}
