package encapsulationdemo.accessmodifier.publicattributes.package2;
import encapsulationdemo.accessmodifier.publicattributes.package1.Animal;
public class Dog {
    public void numberOfLegs(Animal animal){
        System.out.println("Dog has "+animal.legs+" legs");
    }
    /*public void numberOfEyes(){
        System.out.println("Dog has "+this.eyes+" legs");
    }*/

}
