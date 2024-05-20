package polymorphismdemo.methodoverloading.exmple1;

public class Student {
    protected String name;
    protected  int age;
    protected double score;
    protected String branch;

    /* Default Constructor: Its Mandatory to declare no argument constructor
    if you are creating object of student without parameter.
    So, all the instance variables take its default value
     */
    Student(){}
    //Constructor with only two attributes/instance variables
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    //Constructor with all the instance variables from the class
    Student(String name, int age, double score, String branch){
        this.name = name;
        this.age = age;
        this.score = score;
        this.branch = branch;
    }

    protected void displayStudentDisplay(){
        System.out.println("Student Details are");
        System.out.println("--------------------");
        System.out.println("Student Name :"+this.name);
        System.out.println("Student Age:"+this.age);
        System.out.println("Student Score:"+this.score);
        System.out.println("Student Branch:"+this.branch);
        System.out.println();
    }
}
