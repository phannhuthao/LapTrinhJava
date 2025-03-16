package Session3;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên (từ 1 đến 7): ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Chủ nhật");
        } else if (n == 2) {
            System.out.print("Thứ 2");
        } else if (n == 3) {
            System.out.print("Thứ 3");
        } else if (n == 4) {
            System.out.print("Thứ 4");
        } else if (n == 5) {
            System.out.print("Thứ 5");
        } else if (n == 6) {
            System.out.print("Thứ 6");
        } else if (n == 7) {
            System.out.print("Thứ 7");
        }
    }
}
