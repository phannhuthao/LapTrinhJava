package Session4;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N vào: ");
        int n = sc.nextInt();


        if (n <= 0) {
            System.out.print("Số không hợp lệ");
        } else {
            System.out.println("Bảng cửu chương của " + n + " là:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
        sc.close();
    }
}
