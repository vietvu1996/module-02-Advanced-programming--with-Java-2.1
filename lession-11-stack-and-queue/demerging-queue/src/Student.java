public class Student {
    private String name;
    private String gender;
    private String dateOfBirth;

    public Student(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getDay(){
        return Integer.parseInt(dateOfBirth.split("/")[0]);
    }
    public int getMonth(){
        return Integer.parseInt(dateOfBirth.split("/")[1]);
    }
    public int getYear(){
        return Integer.parseInt(dateOfBirth.split("/")[2]);
    }
}
