package Session24.bt5;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        Product p1 = new Electronics("Laptop", 1);
        Product p2 = new Clothing("Áo thun trắng", 2);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.showAllProducts();
    }
}
