package inheritance.hierarchicalinheritancdemo;

public class HierarchicalInheritanceDemo {
    public static void main(String[] args){
        Student studentObj = new Student(111L, "Anitha", "malaghananu@gmail.com",
                98, 100, true);
        studentObj.displayStudentDetails(studentObj);

        Mentor mentorObj = new Mentor(112L, "Akshay", "malaghanakshu@gmil.com",
                "Neosoft", 3);
        mentorObj.displayMentorDetails();

    }
}
