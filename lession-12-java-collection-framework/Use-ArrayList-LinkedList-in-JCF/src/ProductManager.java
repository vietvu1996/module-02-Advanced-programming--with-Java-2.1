import java.util.ArrayList;
import java.util.Comparator;


public class ProductManager {
    private final ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void changeInfo(int id, String newName, float newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Updated information of product");
                System.out.println(product);
                return;
            }
        }
        System.out.println("Cannot find id to fix");
    }

    public Product remove(int id) {
//        for (int i = 0 ; i <products.size();i++) {
//            if (products.get(i).getId() == id) {
//                Product remove = products.remove(i);
//                System.out.println("Product was deleted");
//            }
//        }
        for (Product p : products
             ) {
            if (p.getId() == id){
                products.remove(p);
                return p ;
            }

        }
        System.out.println("Cannot find product to delete");
        return null;
    }

    public void display() {
        for (Product product: products) {
            System.out.println(product.toString());
        }
    }

    public void searchProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println("Product you want to find is: " + product);
                return;
            }
        }
    }

    public int size() {
        return products.size();
    }

    public ArrayList<Product>  sortIncreasePrice(){
     products.sort(Comparator.comparing(Product::getPrice));
     return products;
    }

    public ArrayList<Product>  sortDecreasePrice(){
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        return products;
    }
}
