package Session4;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Nhập một số (nhập 0 để dừng): ");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
        }

        System.out.println("Tổng các số đã nhập là: " + sum);
        sc.close();
    }
}
