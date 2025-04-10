package Session21.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int account = 1000000;

            System.out.print("Nhập số tiền bạn cần rút: ");
            int withdrawMoney = sc.nextInt();

            if (withdrawMoney > account) {
                System.out.print("Lỗi: Số tiền rút vượt quá số dư!");
            } else if (withdrawMoney == account) {
                System.out.print("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            } else {
                account -= withdrawMoney;
                System.out.println("Số tiền rút bạn vừa nhập " + withdrawMoney + " đã được rút thành công");
                System.out.println("Số dư còn lại: " + account + " đồng.");
            }

        } catch (Exception e) {
            System.out.print("Lỗi: Vui lòng nhập một số hợp lệ!");
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi");
        }
    }
}
