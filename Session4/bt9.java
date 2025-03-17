package Session4;
import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Kiểm tra nhập vào hợp lệ
        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                if (N >= 0) {
                    break; // Nếu nhập đúng, thoát vòng lặp
                }
            } else {
                sc.next(); // Xóa đầu vào sai
            }
            System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
        }

        // Xuất các số Armstrong
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
        int sum = 0, temp = num, digits = 0;

        // Đếm số chữ số của num
        int tempCount = num;
        while (tempCount > 0) {
            tempCount /= 10;
            digits++;
        }
        if (num == 0) digits = 1; // Trường hợp đặc biệt: số 0 có 1 chữ số.

        // Tính tổng lũy thừa bậc digits của từng chữ số
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit; // Thay thế Math.pow(digit, digits) để tối ưu
            }
            sum += power;
            temp /= 10;
        }

        return sum == num;
    }
}
