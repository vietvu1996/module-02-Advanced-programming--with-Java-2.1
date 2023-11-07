package entity;

public class Chairman extends User {
    private UserType userType;
    private String name;
    private int Age;
    private String gender;
    private String JobBefore;

    public Chairman(UserType userType, String username, String password, String name, int age, String gender, String jobBefore) {
        super(username, password);
        this.userType = userType;
        this.name = name;
        Age = age;
        this.gender = gender;
        JobBefore = jobBefore;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
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
}
