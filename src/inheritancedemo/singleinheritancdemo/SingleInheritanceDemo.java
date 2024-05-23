package inheritancedemo.singleinheritancdemo;

public class SingleInheritanceDemo {

    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.display();
        childObj.show();

        Parent childObj2 = new Child();
        childObj2.display();
        /*
            java: cannot find symbol
            symbol:   method show()
            location: variable childObj2 of type inheritancedemo.singleinheritancdemo.Parent
        */

        //childObj2.show();

    }


}
