package Session3;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng (1 -> 12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.print("Tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.print("Tháng 2 có 28 ngày");
                break;
            case 3:
                System.out.print("Tháng 3 có 31 ngày");
                break;
            case 4:
                System.out.print("Tháng 4 có 30 ngày");
                break;
            case 5:
                System.out.print("Tháng 5 có 31 ngày");
                break;
            case 6:
                System.out.print("Tháng 6 có 30 ngày");
                break;
            case 7:
                System.out.print("Tháng 7 có 31 ngày");
                break;
            case 8:
                System.out.print("Tháng 8 có 31 ngày");
                break;
            case 9:
                System.out.print("Tháng 9 có 30 ngày");
                break;
            case 10:
                System.out.print("Tháng 10 có 31 ngày");
                break;
            case 11:
                System.out.print("Tháng 11 có 30 ngày");
                break;
            case 12:
                System.out.print("Tháng 12 có 31 ngày");
                break;
        }
    }
}
