package Session3;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số ab: ");
        int b = sc.nextInt();

        System.out.print("Nhập số c: ");
        int c = sc.nextInt();

        if ( a == b && b == c) {
            System.out.println("Ba số bằng nhau");
        } else if (a >= b && a >= c) {
            System.out.println("Số " + a + " là số lớn nhất trong 3 số");
        } else if (b >= a && b >= c) {
            System.out.println("Số " + b + " là số lớn nhất trong 3 số");
        } else {
            System.out.println("Số " + c + " là số lớn nhất trong 3 số");
        }
    }
}
