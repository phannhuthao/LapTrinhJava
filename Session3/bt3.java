package Session3;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình: ");
        float n = sc.nextFloat();

        if (n >= 8.5) {
            System.out.print("Học lực Giỏi");
        } else if (n >= 6.5) {
            System.out.print("Học lực Khá");
        } else if (n >= 5) {
            System.out.print("Học lực Trung Bình");
        } else {
            System.out.print("Học lực Yếu");
        }

        sc.close();
    }
}
