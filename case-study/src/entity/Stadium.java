package entity;

public class Stadium {
    private String name;
    private int capacity;
    private String address;
    private String slogan;

    public Stadium(String name, int capacity, String address, String slogan) {
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.slogan = slogan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
