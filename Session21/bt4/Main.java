package Session21.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập một số nguyên vào: ");
            int n = sc.nextInt();
            System.out.println("Bạn đã nhập: " + n);
        } catch (Exception e) {
            System.out.print("Lỗi: Bạn phải nhập số nguyên!");
        } finally {
            System.out.print("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }
}
