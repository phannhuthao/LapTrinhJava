package Session5;

import java.util.Scanner;
import java.util.Arrays;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Kích thước rỗng");
            return;
        }

        int[] arr = new int[n];

        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Các phần tử của mảng: " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Mảng sau khi bị đảo ngược: " + Arrays.toString(arr));
    }

    public static void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
}
