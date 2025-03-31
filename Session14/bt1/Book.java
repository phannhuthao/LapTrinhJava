package Session14.bt1;

import java.util.Scanner;

public class Book {
    public String bookId;
    public String bookName;
    public int importPrice;
    public int exportPrice;
    public String author;
    public float interest;
    public int year;


    public String getterBookId() {
        return bookId;
    }

    public String getterBookName() {
        return bookName;
    }

    public String getterBookAuthor() {
        return author;
    }

    public int getterBookYear() {
        return year;
    }

    public int getterBookImportPrice() {
        return importPrice;
    }

    public int getterBookExportPrice() {
        return exportPrice;
    }

    public float getterBookInterest() {
        return interest;
    }

    public void setterBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setterBookName(String bookName) {
        this.bookName = bookName;
    }

    public  void setterBookAuthor(String author) {
        this.author = author;
    }

    public void setterBookYear(int year) {
        this.year = year;
    }

    public void setterBookImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public void setterBookExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setterBookInterest(float interest) {
        this.interest = interest;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sách ");
        this.bookId = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        this.bookName = scanner.nextLine();

        System.out.print("Nhập tên tác giả: ");
        this.author = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        this.importPrice = scanner.nextInt();

        System.out.print("Nhập giá xuất: ");
        this.exportPrice = scanner.nextInt();

        System.out.print("Nhập năm xuất bản");
        this.year = scanner.nextInt();

        this.interest = exportPrice - importPrice;

    }
    public void displayData() {
        System.out.printf("Mã sách: %s | Tên sách: %s | Tác giả: %s | Năm XB: %d | Giá nhập: %d | Giá xuất: %d | Lợi nhuận: %.2f\n",
                bookId, bookName, author, year, importPrice, exportPrice, interest);
    }

}
