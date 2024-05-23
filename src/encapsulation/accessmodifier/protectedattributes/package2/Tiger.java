package encapsulation.accessmodifier.protectedattributes.package2;


import encapsulation.accessmodifier.protectedattributes.package1.Animal;

public class Tiger extends Animal {
    @Override
    public void walk(){
        System.out.println("Tiger is waking");
        //This wasn't working with default attributes
        System.out.println("Tiger is walking with"+this.legs +"legs");
    }

    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }


}
