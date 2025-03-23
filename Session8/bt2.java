package Session8;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int  n = sc.nextInt();

        if ( n <= 0) {
            System.out.println("Kích thước không hợp lệ.Nhập lại");
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (arr[i] % 3 == 0 ) {
                sum += arr[i];
            }
        }
        System.out.println("Tổng của các số chia hết cho 3 là: " + sum);
    }
}
