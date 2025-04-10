package Session8;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.print("Kích thước không hợp lệ. Nhập lại");
            return;
        }

        int[] arr = new int[n];

        // Khai báo biến max để lưu giá trị lớn nhất, khởi tạo với giá trị nhỏ nhất có thể có
        int max = Integer.MIN_VALUE;
        // Khai báo biến min để lưu giá trị nhỏ nhất, khởi tạo với giá trị lớn nhất có thể có
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất: " + max + " | Giá trị nhỏ nhất: " + min);
    }
}
