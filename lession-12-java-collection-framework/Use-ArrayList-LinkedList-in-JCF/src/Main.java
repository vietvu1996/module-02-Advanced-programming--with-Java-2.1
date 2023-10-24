public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1, "Flashlight", 1750);
        Product product2 = new Product(2, "Clothes", 1000);
        Product product3 = new Product(3, "Tent", 2500);
        Product product4 = new Product(4, "Knife", 3230);

        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        System.out.println("List of products: ");
        productManager.display();

        System.out.println("\n List after sorting price increasing");
        productManager.sortIncreasePrice();
        productManager.display();


        System.out.println("\n List after sorting price decreasing");
        productManager.sortDecreasePrice();
        productManager.display();

        productManager.remove(4);
        System.out.println("List after removing product ");
        productManager.display();
        System.out.println();

        productManager.searchProduct("Flashlight");
        System.out.println();

        productManager.changeInfo(2, "Black Dagger", 3720);

    }
}