package polymorphismdemo.methodoverloading.exmple1;

public class CompileTimePolymorphismDemo1 {
    public static void main(String[] args){

        //Creating student object without the values of the instance variables
        Student stObj1 = new Student();

        //Creating student object with the values for two instance variables: name and age
        Student stObj2 = new Student("Anitha",29);

        //Creating student object with the values for all instance variables
        Student stObj3 = new Student("Akshay", 28, 99.88, "Informtion Technology");


        // Displaying all the details of objects

        //Option 1: Creating method in the Student class and calling

        stObj1.displayStudentDisplay();
        stObj2.displayStudentDisplay();
        stObj3.displayStudentDisplay();


        /* Option 2: Printing all the Object by calling all its attributes manually

        Displaying all the details of object1

        System.out.println(stObj1.name);
        System.out.println(stObj1.age);
        System.out.println(stObj1.score);
        System.out.println(stObj1.branch);

        // Displaying all the details of object2

        System.out.println(stObj2.name);
        System.out.println(stObj2.age);
        System.out.println(stObj2.score);
        System.out.println(stObj2.branch);

        // Displaying all the details of object3

        System.out.println(stObj3.name);
        System.out.println(stObj3.age);
        System.out.println(stObj3.score);
        System.out.println(stObj3.branch);

         */
    }
}
