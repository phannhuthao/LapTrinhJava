package Session3;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.print("Ba cạnh a, b ,c là tam giác đều");
        } else if (a == b || a == c || b == c) {
            System.out.print("Ba cạnh a, b, c là tam giác cân");
        } else if ((a * a + b * b == c) ||
                (a * a + c * c == b) ||
                (b * b + c * c == a)) {
            System.out.print("Ba cạnh a, b, c là tam giác vuông");
        } else {
            System.out.print("Ba cạnh a, b, c là tam giác thường");
        }

        sc.close();
    }
}
