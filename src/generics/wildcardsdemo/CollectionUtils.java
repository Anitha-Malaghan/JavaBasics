package generics.wildcardsdemo;

import java.util.List;

public class CollectionUtils {

    // Combined method for summing numbers or concatenating strings
    public static <T> Object processList(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }

        T firstElement = list.get(0);
        if (firstElement instanceof Number) {
            double sum = 0.0;
            for (T element : list) {
                sum += ((Number) element).doubleValue();
            }
            return sum;
        } else if (firstElement instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (T element : list) {
                if (element instanceof String) {
                    sb.append((String) element);
                }
            }
            return sb.toString();
        }

        throw new IllegalArgumentException("Unsupported list element type");
    }

    // Unbounded wildcard method for printing lists
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    // Lower bounded wildcard method for adding numbers
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}