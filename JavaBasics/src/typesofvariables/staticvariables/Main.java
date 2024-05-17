package typesofvariables.staticvariables;

import typesofvariables.mixedtypevariables.VariableInspector;

public class Main {
    public static void main(String[] args){
        VariableInspector myVariable1 = new VariableInspector("Akshay", 22, true);
        myVariable1.displayDetails(myVariable1);
        VariableInspector myVariable2 = new VariableInspector("Anu", 24, true);
        myVariable2.displayDetails(myVariable2);
    }
}
