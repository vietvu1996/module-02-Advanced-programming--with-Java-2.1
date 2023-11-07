package entity;

public class TechnicalDirector {
    private String name;
    private int Age;
    private String gender;
    private String JobBefore;
    private String achievement;
    private int experience;
    private int yearsContract;
    private double salary;

    public TechnicalDirector(String name, int age, String gender, String jobBefore, String achievement, int experience, int yearsContract, double salary) {
        this.name = name;
        Age = age;
        this.gender = gender;
        JobBefore = jobBefore;
        this.achievement = achievement;
        this.experience = experience;
        this.yearsContract = yearsContract;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobBefore() {
        return JobBefore;
    }

    public void setJobBefore(String jobBefore) {
        JobBefore = jobBefore;
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
