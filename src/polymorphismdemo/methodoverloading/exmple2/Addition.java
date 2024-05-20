package polymorphismdemo.methodoverloading.exmple2;

public class Addition {
    // Method overloading: compile-time polymorphism
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}


