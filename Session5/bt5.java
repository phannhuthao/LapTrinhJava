package Session5;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Nhập các phần tử trong mảng: ");
        int maxOdd = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0 && arr[i] % 2 != 0) {
                hasOdd = true;
                if (arr[i] > maxOdd) {
                    maxOdd = arr[i];
                }
                if (arr[i] < minOdd) {
                    minOdd = arr[i];
                }
            }
        }

        if (hasOdd) {
            System.out.println("Số nguyên dương lẻ lớn nhất trong mảng là: " + maxOdd);
            System.out.println("Số nguyên dương lẻ nhỏ nhất trong mảng là: " + minOdd);
        } else {
            System.out.println("Không có phần tử lẻ trong mảng");
        }
    }
}
