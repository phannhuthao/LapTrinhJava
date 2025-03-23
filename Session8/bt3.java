package Session8;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;
        String password;

        // Kiểm tra email hợp lệ
        while (true) {
            System.out.print("Nhập email: ");
            email = sc.next();
            if (email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.(com|vn|org)$")) {
                break;
            } else {
                System.out.println("Email không hợp lệ! Vui lòng nhập lại.");
            }
        }

        // Kiểm tra password hợp lệ
        while (true) {
            System.out.print("Nhập password: ");
            password = sc.next();
            if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}$")) {
                break; 
            } else {
                System.out.println("Mật khẩu không hợp lệ! Vui lòng nhập lại.");
                System.out.println("Mật khẩu phải có ít nhất 8 ký tự, chứa ít nhất một chữ hoa, một chữ thường, một số và một ký tự đặc biệt.");
            }
        }

        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
