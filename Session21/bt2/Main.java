package Session21.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chỉ số của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập chỉ số phần tử muốn truy cập vào: ");
        int input  = sc.nextInt();

        try {
            System.out.println("Giá trị tại vị trí " + input + " là: " + arr[input]);
        } catch (ArithmeticException e) {
            System.out.println("Vượt quá chỉ số mảng! Chỉ số hợp lệ là từ 0 đến ");
        }
    }
}
