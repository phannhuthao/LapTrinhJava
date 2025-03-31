package Session14.bt1;

import java.util.*;

public class BookImp {
    public static ArrayList<Book> books = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("********************* MENU ******************");
            System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("5. Thống kê số lượng sách theo từng năm xuất bản");
            System.out.println("6. Thống kê số lượng sách theo từng tác giả");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addInfoBook();
                    break;
                case 2:
                    calculateProfit();
                    break;
                case 3:
                    showInfoBook();
                    break;
                case 4:
                    searchNameBook();
                    break;
                case 5:
                    bookStatisticsByYear();
                    break;
                case 6:
                    bookCountByAuthor();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Nhập không hợp lệ");
            }
        }
    }

    public static void addInfoBook() {
        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.inputData();
            books.add(book);
        }
    }

    public static void calculateProfit() {
        for (Book book : books) {
            book.interest = book.exportPrice - book.importPrice;
        }
        System.out.println("Đã tính lợi nhuận cho tất cả sách.");
    }

    public static void showInfoBook() {
        for (Book book : books) {
            book.displayData();
        }
    }

    public static void searchNameBook() {
        System.out.print("Nhập tên sách cần tìm: ");
        String name = sc.nextLine();
        for (Book book : books) {
            if (book.bookName.equalsIgnoreCase(name)) {
                book.displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy sách với tên đã nhập.");
    }

    public static void bookStatisticsByYear() {
        System.out.print("Nhập năm xuất bản: ");
        int year = sc.nextInt();
        int count = 0;
        for (Book book : books) {
            if (book.year == year) {
                count++;
            }
        }
        System.out.println("Số lượng sách xuất bản trong năm " + year + ": " + count);
    }

    public static void bookCountByAuthor() {
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        int count = 0;
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                count++;
            }
        }
        System.out.println("Số lượng sách của tác giả " + author + ": " + count);
    }
}