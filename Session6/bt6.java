package Session6;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu vào: ");
        String password = sc.nextLine();

        String[] words = password.split("\\s+");

        if (password.length() < 8) {
            System.out.println("Mật khẩu không hợp lệ. Phải có ít nhất 8 ký tự");
            return;
        }

        boolean VietHoa = false, ChuThuong = false, KyTuSo = false, KyTuDacBiet = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                VietHoa = true;
            } else if (Character.isLowerCase(c)) {
                ChuThuong = true;
            } else if (Character.isDigit(c)) {
                KyTuSo = true;
            } else if ("!@#$%^&*()".contains(String.valueOf(c))) {
                KyTuDacBiet = true;
            }
        }

        if (VietHoa && ChuThuong && KyTuSo && KyTuDacBiet) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.out.println("Mật khẩu không hợp lệ: Phải chứa ít nhất 1 chữ hoa, 1 chữ thường, 1 số, và 1 ký tự đặc biệt.");
        }
    }
}
