package Session7;

import java.util.Random;
import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N: ");
        int n = sc.nextInt();

        if (n < 1 || n > 1000) {
            System.out.println("Chỉ nhận từ 1 đến 1000");
            return;
        }

        StringBuilder sb = new StringBuilder(n);
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < n; i++) {
            // Chọn một vị trí ngẫu nhiên trong chuỗi
            int index = random.nextInt(chars.length());
            // Thêm ký tự ngẫu nhiên vào chuỗi kết quả
            sb.append(chars.charAt(index));
        }

        System.out.println("Chuỗi ngẫu nhiên: " + sb);
    }
}
