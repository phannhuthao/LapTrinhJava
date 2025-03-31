package Session14.bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm: ");
        this.productId = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        this.quantity = scanner.nextInt();

        System.out.print("Nhập mô tả: ");
        this.descriptions = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        this.importPrice = scanner.nextFloat();

        System.out.print("Nhập giá xuất: ");
        this.exportPrice = scanner.nextFloat();
    }

    public void displayData() {
        System.out.println(" ");
        System.out.printf("Mã sản phẩm: %s | Tên sản phâm: %s | số lượng: %d | Mô tả: %s | Giá nhập: %2f | Giá xuất: %2f| Lợi nhuận: %2f",
                productId, productName, quantity, descriptions, importPrice, exportPrice, profit);
    }

    public void calculateProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

}