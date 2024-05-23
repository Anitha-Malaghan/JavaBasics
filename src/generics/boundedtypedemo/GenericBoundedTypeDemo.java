package generics.boundedtypedemo;

public class GenericBoundedTypeDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.println("Sum of Integer Array: " + BoundedType.sum(intArray));
        System.out.println("Sum of Double Array: " + BoundedType.sum(doubleArray));
    }
}
