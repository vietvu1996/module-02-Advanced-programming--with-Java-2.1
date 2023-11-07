package entity;

public class AssistantCoach extends User {
    private UserType userType;
    private String fullName;
    private int Age;
    private String nationality;
    private String dateOfBirth;
    private int yearsContract;
    private double salary;

    public AssistantCoach(UserType userType,String username, String password, String fullName, int age, String nationality, String dateOfBirth, int yearsContract, double salary) {
        super(username, password);
        this.userType = userType;
        this.fullName = fullName;
        Age = age;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.yearsContract = yearsContract;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getYearsContract() {
        return yearsContract;
    }

    public void setYearsContract(int yearsContract) {
        this.yearsContract = yearsContract;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
