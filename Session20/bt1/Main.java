package Session20.bt1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phân tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Danh sách các số chẵn: ");
        Arrays.stream(arr).filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
