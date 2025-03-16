package Session4;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int balance;

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = Math.abs(n);
            System.out.println("Số " + n + " đã được chuyển thành số dương");
        } else {
            System.out.println( n + " là số dương");
        }
        int temp = n;
        for (int i = 1; i <= n; i++) {
            balance = temp % 10;
            sum += balance;
            temp /= 10;
        }

        System.out.println("Tổng các chữ số = " + sum);
        sc.close();
    }
}
