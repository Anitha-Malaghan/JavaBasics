package generics.classforcollectionsdemo;

public class GenericClassWithCollectionsDemo {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        integerBox.add(20);
        integerBox.add(30);

        stringBox.add("Hello");
        stringBox.add("World");

        System.out.println("Integer Values:");
        for (Integer value : integerBox.getAll()) {
            System.out.println(value);
        }

        System.out.println("String Values:");
        for (String value : stringBox.getAll()) {
            System.out.println(value);
        }
    }
}


