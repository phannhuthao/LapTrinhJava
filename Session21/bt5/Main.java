package Session21.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập một số nguyên tố: ");
            int n = sc.nextInt();
            if (n == 0 || n < 0) {
                System.out.print("Không hợp lệ");
            } else {
                System.out.print("Số " + n + " là một số nguyên tố" );
            }
        } catch (Exception e) {
            System.out.print("Bạn nhập sai. Cái này không phải là số nguyên tố");
        }
    }
}
