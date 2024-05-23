package polymorphism.methodoverriding.example1;

public class Child1 extends Parent1 {

    protected void sayHello(){
        //Helps to call the sayHello method available in the parent without creating its object.
        //super.sayHello();
        System.out.println("Hello from the child :)");
    }

}
