package encapsulation.accessmodifier.publicattributes.package1;


 /*
  Default instance variables are accessible in the following areas:
    - Anywhere inside the class
    - Other classes in the same package
    - Child classes in the same package
    -Child classes in the other package
  Not accessible in the following areas:
    -Anywhere
 */


public class Main {
    public static void main(String[] args){
        Cat catObj = new Cat();
        catObj.walk();
        catObj.eat();
    }
}
