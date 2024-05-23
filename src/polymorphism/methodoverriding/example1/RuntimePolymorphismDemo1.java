package polymorphism.methodoverriding.example1;

public class RuntimePolymorphismDemo1 {
    public static void main(String[] args){
        // Child invoking its sayHello()
        //Option 1
        Child1 childObj1 = new Child1();
        childObj1.sayHello();

        //Option 2
        Parent1 childObj2 = new Child1();
        childObj2.sayHello();
    }

}
