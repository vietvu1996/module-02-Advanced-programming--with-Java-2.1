package menu.MenuChairman;

public class TransferMarket {
    private int Id;
    private String name;
    private String position;
    private String DateOfBirth;
    private String gender;
    private String nationality;
    private double price;

    public TransferMarket(int id, String name, String position, String dateOfBirth, String gender, String nationality, double price) {
        Id = id;
        this.name = name;
        this.position = position;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TransferMarket{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", price=" + price +
                '}';
    }
}
