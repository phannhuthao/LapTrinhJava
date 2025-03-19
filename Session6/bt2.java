package Session6;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi (email): ");
        String email = sc.nextLine().trim();

        if (email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.print("Email hợp lệ");
        } else {
            System.out.print("Email không hợp lệ");
        }

//        if (email.contains("@") || email.contains(".")) {
//            System.out.print("Email hợp lệ");
//        } else {
//            System.out.print("Email không hợp lệ");
//        }

//        String[] arr = email.trim().matches();
//        if (arr[0].equals("email")) {
//        }
    }
}
