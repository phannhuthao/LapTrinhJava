package Session6;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi vào: ");
        String str = sc.nextLine();

        System.out.print("Nhập từ cần tìm trong chuỗi: ");
        String search = sc.nextLine();

        int index = str.indexOf(search);

        if (index != -1) {
            System.out.print("Từ \"" + search + "\" xuất hiện tại vị trí " + index + " trong chuỗi");
        } else {
            System.out.print("Từ \"" + search + "\" không xuất hiện trong chuỗi");
        }
    }
}
