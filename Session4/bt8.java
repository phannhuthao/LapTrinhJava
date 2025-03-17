package Session4;
import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Kiểm tra nhập vào hợp lệ
        do {
            System.out.print("Nhập số nguyên dương N: ");
            while (!sc.hasNextInt()) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
                sc.next(); // Xóa đầu vào không hợp lệ
                System.out.print("Nhập số nguyên dương N: ");
            }
            N = sc.nextInt();
            if (N < 0) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
            }
        } while (N < 0);

        System.out.println("Các số Armstrong từ 0 đến " + N + " là:");
        for (int i = 0; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    // Hàm kiểm tra số Armstrong
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }
}
