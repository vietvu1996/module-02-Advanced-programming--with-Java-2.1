package entity;

public class Coach extends User {
    private UserType userType;
    private String fullName;
    private int Age;
    private String nationality;
    private String dateOfBirth;
    private String achievement;
    private int experience;
    private String footballStyle;
    private int tactical;
    private int yearsContract;
    private double salary;

    public Coach( UserType userType,String username, String password, String fullName, int age, String nationality, String dateOfBirth, String achievement, int experience, String footballStyle, int tactical, int yearsContract, double salary) {
        super(username, password);
        this.userType = userType;
        this.fullName = fullName;
        Age = age;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.achievement = achievement;
        this.experience = experience;
        this.footballStyle = footballStyle;
        this.tactical = tactical;
        this.yearsContract = yearsContract;
        this.salary = salary;
    }

    public Coach(String username, String password) {
        super(username, password);
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

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getFootballStyle() {
        return footballStyle;
    }

    public void setFootballStyle(String footballStyle) {
        this.footballStyle = footballStyle;
    }

    public int getTactical() {
        return tactical;
    }

    public void setTactical(int tactical) {
        this.tactical = tactical;
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
