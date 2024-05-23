package inheritance.hierarchicalinheritancdemo;

public class Mentor extends User {
    private String companyName;
    private int yearOfExperience;
    public Mentor(Long id, String name, String email, String companyName, int yearOfExperience){
        super(id, name, email);
        this.companyName = companyName;
        this.yearOfExperience= yearOfExperience;
    }

    public void displayMentorDetails(){
        System.out.println("Mentor details");
        System.out.println("student id:"+ this.id);
        System.out.println("student name:"+this.name);
        System.out.println("student email:"+this.email);
        System.out.println("student attendance"+this.companyName);
        System.out.println("student workingStatus"+this.yearOfExperience);

    }
}
