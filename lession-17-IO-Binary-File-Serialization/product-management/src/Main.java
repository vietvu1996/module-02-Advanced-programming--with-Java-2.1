import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Vodafone", 2000, "England", "stocking"));
        products.add(new Product(2, "Blackberry", 1500, "Canada", "stocking"));
        products.add(new Product(3, "Oppo", 3000, "China", "out of stock"));
        products.add(new Product(4, "LG", 1000, "Korea", "stocking"));
        products.add(new Product(5, "Motorola", 500, "USA", "out of stock"));

        System.out.println(products);
        writeProductToFile("src/product.txt", products);
        System.out.println(readProductFromFile("src/product.txt"));

        writeProductToFile("src/products.txt", products);
        System.out.println(readProductFromFile("src/products.txt"));
    }

    public static void writeProductToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProductFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}