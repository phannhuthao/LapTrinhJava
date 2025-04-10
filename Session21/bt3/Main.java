package Session21.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn vào: ");
        int age =  sc.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Bạn chưa đủ 18 tuổi!");
        } else {
            System.out.print("Chào mừng bạn!");
        }
    }
}
