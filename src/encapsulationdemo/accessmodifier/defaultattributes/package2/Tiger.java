package encapsulationdemo.accessmodifier.defaultattributes.package2;


import encapsulationdemo.accessmodifier.defaultattributes.package1.Animal;

public class Tiger extends Animal {
    @Override
    public void walk(){
        System.out.println("Tiger is waking");

        /*legs is not public in
        encapsulationdemo.accessmodifier.defaultattributes.package1.AnimalForEncap;
        cannot be accessed from outside package */

        //System.out.println("Tiger is walking with"+this.legs +"legs");
    }

    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }


}
