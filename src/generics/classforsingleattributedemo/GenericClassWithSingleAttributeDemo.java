package generics.classforsingleattributedemo;

public class GenericClassWithSingleAttributeDemo {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.setContent(10);
        stringBox.setContent("Hello Generics");

        System.out.println("Integer Value: " + integerBox.getContent());
        System.out.println("String Value: " + stringBox.getContent());
    }
}
