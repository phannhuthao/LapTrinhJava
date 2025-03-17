package Session4;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+-----------------------MENU----------------------+");
            System.out.println("| 1. Kiểm tra một số có phải là số nguyên tố không.");
            System.out.println("| 2. Kiểm tra một số có phải là số hoàn hảo không. ");
            System.out.println("| 3. Tìm và tính tổng tất cả các ước của một số.   ");
            System.out.println("| 4. Thoát chương trình.                           ");
            System.out.println("+-------------------------------------------------+");
            System.out.print("Nhập lựa chọn của bạn: ");

            while (!sc.hasNextInt()) {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập số từ 1 đến 4.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkPrimeNumber(sc);
                    break;
                case 2:
                    checkPerfectNumber(sc);
                    break;
                case 3:
                    findAndSumDivisors(sc);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập số từ 1 đến 4.");
            }
        } while (choice != 4);

        sc.close();
    }

    public static void checkPrimeNumber(Scanner sc) {
        System.out.print("Nhập một số để kiểm tra số nguyên tố: ");
        int num = getPositiveNumber(sc);

        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void checkPerfectNumber(Scanner sc) {
        System.out.print("Nhập một số để kiểm tra số hoàn hảo: ");
        int num = getPositiveNumber(sc);

        if (isPerfect(num)) {
            System.out.println(num + " là số hoàn hảo.");
        } else {
            System.out.println(num + " không phải là số hoàn hảo.");
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void findAndSumDivisors(Scanner sc) {
        System.out.print("Nhập một số để tìm các ước và tính tổng: ");
        int num = getPositiveNumber(sc);

        int sum = 0;
        System.out.print("Các ước của " + num + " là: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTổng các ước của " + num + " là: " + sum);
    }

    public static int getPositiveNumber(Scanner sc) {
        int num;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập một số nguyên dương.");
                sc.next();
            }
            num = sc.nextInt();
            if (num > 0) break;
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
        }
        return num;
    }
}
