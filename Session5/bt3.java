package Session5;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int countEven = 0;

        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.print("Tổng số lượng các phần tử chẵn trong mảng là: " + countEven);
    }
}
