package entity;

public class Player extends User {
    private UserType userType;
    private int Id;
    private String fullName;
    private String position;
    private String DateOfBirth;
    private String gender;
    private String nationality;
    private double height;
    private double weight;
    private boolean isLamasia;
    private int TshirtNumber;
    private int yearsContract;
    private double salary;

    public Player(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    public Player(int id, String fullName, String position, String dateOfBirth, String nationality, double height, double weight, boolean isLamasia, int tshirtNumber) {
        Id = id;
        this.fullName = fullName;
        this.position = position;
        DateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.isLamasia = isLamasia;
        TshirtNumber = tshirtNumber;
    }

    public Player(UserType userType, String username, String password, int id, String fullName, String position, String dateOfBirth, String gender, String nationality, double height, double weight, boolean isLamasia, int tshirtNumber, int yearsContract, double salary) {
        super(username, password);
        this.userType = userType;
        this.fullName = fullName;
        Id = id;
        this.position = position;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.isLamasia = isLamasia;
        TshirtNumber = tshirtNumber;
        this.yearsContract = yearsContract;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLamasia() {
        return isLamasia;
    }

    public void setLamasia(boolean lamasia) {
        isLamasia = lamasia;
    }

    public int getTshirtNumber() {
        return TshirtNumber;
    }

    public void setTshirtNumber(int tshirtNumber) {
        TshirtNumber = tshirtNumber;
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", isLamasia=" + isLamasia +
                ", TshirtNumber=" + TshirtNumber +
                ", yearsContract=" + yearsContract +
                ", salary=" + salary +
                '}';
    }
}
