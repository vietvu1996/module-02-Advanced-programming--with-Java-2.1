import java.util.LinkedList;

public class ProductManager1 {
    private final LinkedList<Product> products = new LinkedList<>();

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

    public Product remove(int id){
        for (Product p: products) {
            if(p.getId() == id){
                products.remove(p);
                return p;
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

//    public void sortPriceDecreasing(){
//        products.sort((o1, o2) -> {
//            float price1 = o1.getPrice();
//            float price2 = o2.getPrice();
//            return Float.compare(price1, price2);
//        });
//    }
    public void sortPriceDecreasing(){
        products.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
    }

   public void sortPriceIncreasing(){
        products.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
   }

//    public void sortPriceIncreasing() {
//        products.sort((o1, o2) -> {
//            float o1Price = o1.getPrice();
//            float o2Price = o2.getPrice();
//            return Float.compare(o1Price , o2Price);
//        });
//    }
//
//    public void sortPriceDecreasing() {
//        products.sort((o1, o2) -> {
//            float o1Price = o1.getPrice();
//            float o2Price = o2.getPrice();
//            return -Float.compare(o1Price , o2Price);
//        });
//    }
}
