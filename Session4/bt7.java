package Session4;

import java.util.HashSet;
import java.util.Scanner;

public class bt7 {

    // Hàm kiểm tra xem một số có phải là số Happy hay không
    public static boolean isHappyNumber(int num) {
        // Tạo một HashSet để lưu các số đã xuất hiện
        // Mục đích là để phát hiện vòng lặp vô hạn (tránh kiểm tra mãi mãi)
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Tiếp tục lặp cho đến khi số trở thành 1 (Happy) hoặc rơi vào vòng lặp vô hạn
        while (num != 1 && !seenNumbers.contains(num)) {
            // Thêm số hiện tại vào danh sách các số đã xuất hiện
            seenNumbers.add(num);
            // Thay num bằng tổng bình phương các chữ số của nó
            num = getSumOfSquares(num);
        }

        // Nếu num trở thành 1 thì nó là số Happy, ngược lại là số không Happy
        return num == 1;
    }

    // Hàm tính tổng bình phương các chữ số của một số
    public static int getSumOfSquares(int num) {
        int sum = 0; // Biến lưu tổng bình phương các chữ số

        // Lặp qua từng chữ số của num
        while (num > 0) {
            int digit = num % 10;  // Lấy chữ số cuối cùng của num
            sum += digit * digit;  // Bình phương chữ số và cộng vào tổng
            num /= 10;  // Loại bỏ chữ số cuối cùng để tiếp tục vòng lặp
        }

        return sum; // Trả về tổng bình phương các chữ số
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Số nhập không hợp lệ. Vui lòng nhập số nguyên dương.");
        } else {
            System.out.print("Các số Happy nhỏ hoặc bằng " + n + " là: ");
            for (int i = 1; i <= n; i++) {
                if (isHappyNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        input.close();
    }
}
