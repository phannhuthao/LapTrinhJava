package Session21.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        try {
            int resutlt = a / b;
            System.out.println("Kết quả phép chia: " + resutlt);
        } catch (ArithmeticException e) {
            System.out.print("A hay B không thể là số 0");
        }
    }
}
