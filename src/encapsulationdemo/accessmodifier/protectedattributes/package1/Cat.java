package encapsulationdemo.accessmodifier.protectedattributes.package1;

public class Cat extends Animal {
    @Override
    public void walk(){
        System.out.println("Cat is walking with:"+this.legs );
    }
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

}
