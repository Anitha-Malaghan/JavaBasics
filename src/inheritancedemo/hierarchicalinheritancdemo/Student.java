package inheritancedemo.hierarchicalinheritancdemo;

public class Student extends User {
    //Declaring instance variables
    private int problemSolvingPercentage;
    private int attendance;
    private boolean workingStatus;

    //Custom Constructor
    public Student(Long id, String name, String email,
                   int problemSolvingPercentage, int attendance, boolean workingStatus){
        //Creating an object of parent using super()
        super(id,name,email);

        //Initializing instance variables
        this.problemSolvingPercentage = problemSolvingPercentage;
        this.attendance = attendance;
        this.workingStatus = workingStatus;
    }
    public void displayStudentDetails(Student st){
        System.out.println("Student details");
        System.out.println("student id:"+st.id);
        System.out.println("student name:"+st.name);
        System.out.println("student email:"+st.email);
        System.out.println("student problemSolvingPercentage:"+st.problemSolvingPercentage);
        System.out.println("student attendance"+st.attendance);
        System.out.println("student workingStatus"+st.workingStatus);

    }
}
