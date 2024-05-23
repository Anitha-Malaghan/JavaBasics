package inheritancedemo.hierarchicalinheritancdemo;

public class Instructor extends User {
    private String companyName;
    private int ratings;
    public Instructor(Long id, String name, String email, String companyName, int ratings){
        super(id, name, email);
        this.companyName = companyName;
        this.ratings = ratings;
    }
}
