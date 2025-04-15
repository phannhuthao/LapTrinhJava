package Session24.bt5;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showAllProducts() {
        for (Product p : products) {
            p.displayInfo();
        }
    }
}
