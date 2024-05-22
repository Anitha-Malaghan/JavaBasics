package generics.methoddemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
import static generics.methoddemo.PrintArrayValues.printArray;
printArray(intArray);

A generic method allows you to create a method that can be called with different types of arguments.

*/
public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        System.out.println("Integer Array:");
        DisplayMethods.printArray(intArray);

        System.out.println("String Array:");
        DisplayMethods.printArray(strArray);


        // Create collections
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3));

        List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // Print elements of Integer collection
        System.out.println("Integer Collection:");
        DisplayMethods.printCollection(integerList);

        // Print elements of String collection
        System.out.println("String Collection:");
        DisplayMethods.printCollection(strList);
    }
}
