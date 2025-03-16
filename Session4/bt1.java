package Session4;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N vào: ");
        double n = sc.nextDouble();

        if (n <= 0) {
            System.out.print("Số không hợp lệ");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        }

        sc.close();
    }
}
