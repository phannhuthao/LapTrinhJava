package Session4;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố");
        } else {
            boolean isPrime = true; // Giả định ban đầu là số nguyên tố
            int squareRoot = (int) Math.sqrt(n);

            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không phải là số nguyên tố");
            }
        }
        sc.close();
    }
}
