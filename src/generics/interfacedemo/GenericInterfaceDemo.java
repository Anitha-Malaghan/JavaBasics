package generics.interfacedemo;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Container<Integer> integerContainer = new ContainerImplementation<>();
        integerContainer.add(1);
        integerContainer.add(2);

        System.out.println("Integer Container: " + integerContainer.get(0) + ", " + integerContainer.get(1));

        Container<String> stringContainer = new ContainerImplementation<>();
        stringContainer.add("Hello");
        stringContainer.add("World");

        System.out.println("String Container: " + stringContainer.get(0) + ", " + stringContainer.get(1));
    }
}
