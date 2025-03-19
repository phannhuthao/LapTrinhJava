package Session6;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        int totalStr = 0;
        String[] words = str.split("\\s+");

        System.out.print("Các từ có ký tự đặc biệt: ");
        for (String word : words) {
            if (word.matches(".*[!@#$%^&*()].*")) {
                System.out.print(word + " ");
                totalStr++;
            }
        }

        System.out.println("\nSố từ có ký tự đặc biệt là: " + totalStr);
    }
}
