package Session14.bt2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductImp {
    public static ArrayList<Product> products = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("*********************** MENU **************************");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Thống kê các sản phẩm theo giá");
            System.out.println("5. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("6. Nhập hàng vào kho");
            System.out.println("7. Bán sản phẩm");
            System.out.println("8. Cập nhật trạng thái sản phẩm");
            System.out.println("9. Thoát");
            System.out.println("***********************------**************************");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addInfo();
                    break;
                case 2:
                    showInfo();
                    break;
                case 3:
                    calculateProfit();
                    break;
                case 4:
                    statisticsByPrice();
                    break;
                case 5:
                    searchByProductName();
                    break;
                case 6:
                    addWarehouse();
                    break;
                case 7:
                    buyProduct();
                    break;
                case 8:
                    updateStatusProduct();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
    public static void addInfo() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
            Product p = new Product();
            p.inputData();
            products.add(p);
        }
    }

    public static void showInfo() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm để hiển thị");
        }
        for (Product product : products) {
            product.displayData();
        }
    }

    public static void calculateProfit() {
        for (Product product : products) {
            product.calculateProfit();
        }
        System.out.println("Đã tính lợi nhuận cho tất cả sản phẩm.");
    }

    public static void statisticsByPrice() {
        System.out.print("Nhập khoảng giá từ: ");
        float fromPrice = sc.nextFloat();
        System.out.print("Nhập khoảng giá đến: ");
        float toPrice = sc.nextFloat();

        int count = 0;
        for (Product product : products) {
            if (product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice) {
                count++;
                product.displayData();
            }
        }
        System.out.println("Tổng số sản phẩm trong khoảng giá: " + count);
    }

    public static void searchByProductName() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                product.displayData();
            }
        }
    }

    public static void addWarehouse() {
        System.out.print("Nhập mã sản phẩm cần nhập kho: ");
        sc.nextLine();
        String productId = sc.nextLine();
        System.out.print("Nhập số lượng sản phẩm cần nhập: ");
        int quantity = sc.nextInt();

        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setQuantity(product.getQuantity() + quantity);
                System.out.println("Nhập hàng thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có mã này!");
    }

    public static void buyProduct() {
        System.out.print("Nhập tên sản phẩm cần bán: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Nhập số lượng sản phẩm cần bán: ");
        int quantity = sc.nextInt();

        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Bán hàng thành công!");
                } else {
                    System.out.println("Không đủ số lượng để bán!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có tên này!");
    }

    public static void updateStatusProduct() {
        System.out.print("Nhập mã sản phẩm cần cập nhật trạng thái: ");
        sc.nextLine();
        String productId = sc.nextLine();

        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setStatus(!product.isStatus());
                System.out.println("Cập nhật trạng thái thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có mã này!");
    }
}
