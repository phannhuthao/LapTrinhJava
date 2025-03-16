package Session3;

import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương (100 -> 999): ");
        int n = sc.nextInt();



        if (n < 100 || n > 999) {
            System.out.print("Số nhập vào không hợp lệ");
        } else {
            int hundreds = n / 100;
            int tens = (n / 10) % 10;
            int units = n % 10;
            System.out.print(convertNumberToWords(hundreds, tens, units));
        }
        sc.close();
    }

    public static String convertNumberToWords(int hundreds, int tens, int units) {
        String[] numWords = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String result = "";

        result += numWords[hundreds] + " trăm ";

        if (tens == 0 && units != 0) {
            result += "lẻ ";
        } else if (tens == 1) {
            result += "mười ";
        } else if (tens > 1) {
            result += numWords[tens] + " mươi ";
        }

        if (units == 1 && tens > 1) {
            result += "mốt";
        } else if (units == 5 && tens > 0) {
            result += "lăm";
        } else if (units > 0) {
            result += numWords[units];
        }

        return result.trim();
    }
}
