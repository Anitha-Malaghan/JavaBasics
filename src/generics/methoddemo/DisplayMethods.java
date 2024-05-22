package generics.methoddemo;

import java.util.Collection;

public class DisplayMethods {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> void printCollection(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }
}
