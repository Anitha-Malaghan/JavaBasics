package polymorphism.methodoverloading.exmple2;

public class CompileTimePolymorphismDemo2 {
    static Addition addObj = new Addition();
    public static void main(String[] args) {
        System.out.println("Addition of integers: " + addObj.add(5, 10));
        System.out.println("Addition of doubles: " + addObj.add(5.5, 10.5));
        System.out.println("Addition of strings: " + addObj.add("Hello", " World"));
    }


}
