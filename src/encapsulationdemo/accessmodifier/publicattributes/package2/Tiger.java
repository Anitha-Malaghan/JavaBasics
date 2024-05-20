package encapsulationdemo.accessmodifier.publicattributes.package2;


import encapsulationdemo.accessmodifier.protectedattributes.package1.Animal;
//Child class in the other package
public class Tiger extends Animal {
    public int eyes=2;
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
