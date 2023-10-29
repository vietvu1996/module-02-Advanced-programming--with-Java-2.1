import java.util.PrimitiveIterator;

public class Product {
    private int code;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(){}

    public Product(int code, String name, double price, String manufacturer, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product {" +
                "code =" + code +
                ", name ='" + name + '\'' +
                ", price =" + price +
                ", manufacturer ='" + manufacturer + '\'' +
                ", description ='" + description + '\'' +
                '}';
    }
}
