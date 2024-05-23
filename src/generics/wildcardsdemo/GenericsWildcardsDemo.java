package generics.wildcardsdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardsDemo {

        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);
            intList.add(3);

            List<Double> doubleList = new ArrayList<>();
            doubleList.add(1.1);
            doubleList.add(2.2);
            doubleList.add(3.3);

            List<String> strList = new ArrayList<>();
            strList.add("a");
            strList.add("a");
            strList.add("a");

            System.out.println("Printing Integer List:");
            CollectionUtils.printList(intList);
            System.out.println("Sum of Integer List: " + CollectionUtils.processList(intList));

            System.out.println("Printing Double List:");
            CollectionUtils.printList(doubleList);
            System.out.println("Sum of Integer List: " + CollectionUtils.processList(doubleList));


            System.out.println("Printing String List:");
            CollectionUtils.printList(strList);
            System.out.println("Sum of Double List: " + CollectionUtils.processList(strList));


            List<Number> numberList = new ArrayList<>();
            CollectionUtils.addNumbers(numberList);
            System.out.println("Numbers in Number List:");
            CollectionUtils.printList(numberList);
        }
}

