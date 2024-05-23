package classesandobjects;

public class ClassesAndObjectsDemo {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Using the object to call a method
        myCar.displayInfo();

        // Modifying object state
        myCar.setYear(2021);
        System.out.println("Updated Year: " + myCar.getYear());
    }


}
