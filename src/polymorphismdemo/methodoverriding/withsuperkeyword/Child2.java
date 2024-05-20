package polymorphismdemo.methodoverriding.withsuperkeyword;

public class Child2 extends Parent2 {

    protected void sayHello(){
        //Helps to call the sayHello method available in the parent without creating its object.
        super.sayHello();
        System.out.println("Hello from the child :)");
    }

}
