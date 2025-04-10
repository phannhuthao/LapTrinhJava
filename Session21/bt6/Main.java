package Session21.bt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        System.out.print("Nhập các chuỗi (cách nhau bởi dấu cách): ");
        String input = sc.nextLine();

        String[] arr = input.trim().split("\\s+");

        for (String s : arr) {
            try {
                int num = Integer.parseInt(s);
                validNumbers.add(num);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Số lượng chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách số nguyên hợp lệ: " + validNumbers);
    }
}
