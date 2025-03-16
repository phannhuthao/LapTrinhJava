package Session4;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int n = input.nextInt();

        boolean hasPerfectNumber = true;

        System.out.println("Các số hoàn hảo nhỏ hơn " + n + " là: ");

        for (int i = 1; i < n; i++) {
            int sum = 0;

            // Tìm tổng các ước số của i (trừ chính nó)
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
                hasPerfectNumber = true;
            }
        }

        if (!hasPerfectNumber) {
            System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
        }

        input.close();

    }
}
