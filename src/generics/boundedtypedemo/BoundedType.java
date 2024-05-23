package generics.boundedtypedemo;

public class BoundedType {
    public static <T extends Number> double sum(T[] numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
