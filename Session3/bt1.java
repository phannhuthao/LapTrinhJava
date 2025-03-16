package Session3;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("Số " + N + " không phải số chẵn hay lẻ");
        } else if (N % 2 == 0) {
            System.out.println("Số " + N + " là số chẵn");
        } else {
            System.out.println("Số " + N + " này là số lẻ");
        }

    }
}
