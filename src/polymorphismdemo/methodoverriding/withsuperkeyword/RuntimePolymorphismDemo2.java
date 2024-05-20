package polymorphismdemo.methodoverriding.withsuperkeyword;

public class RuntimePolymorphismDemo2 {
    public static void main(String[] args){
        // Child invoking its sayHello()
        //Option 1
        Child2 childObj1 = new Child2();
        childObj1.sayHello();

        //Option 2
        Parent2 childObj2  = new Child2();
        childObj2.sayHello();
    }

}
