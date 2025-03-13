package Session2;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        boolean a = sc.nextInt() != 0;

        System.out.print("Nhập b: ");
        boolean b = sc.nextInt() != 0;

        System.out.print("Nhập c: ");
        boolean c = sc.nextInt() != 0;

        boolean condition1 = a && b;
        boolean condition2 = a || b;
        boolean condition3 = ! c;

        System.out.println("Kết quả của condition1: " + condition1);
        System.out.println("Kết quả của condition2: " + condition2);
        System.out.println("Kết quả của condition: " + condition3);


        sc.close();

    }
}
