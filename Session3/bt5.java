package Session3;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số 1: ");
        float n1 = sc.nextFloat();

        System.out.print("Nhập phép toán (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Nhập số 2: ");
        float n2 = sc.nextFloat();

        switch (operator) {
            case '+':
                System.out.print("Kết quả phép cộng: "+ (n1 + n2));
                break;
            case '-':
                System.out.print("Kết quả phép trừ: "+ (n1 - n2));
                break;
            case '*':
                System.out.print("Kết quả phép nhân: "+ (n1 * n2));
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Không thể chia cho 0");
                } else {
                    System.out.println("Kết quả phép chia: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ");
        }

    }
}
