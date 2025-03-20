package Session7;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập một chuỗi vào: ");
        String word = input.nextLine();

        System.out.println("Chuỗi khi nhập: " + word);

        StringBuilder sb = new StringBuilder(word);

        sb.reverse();
        System.out.println("Chuỗi sau khi đảo ngược là: " + sb.toString());
    }
}
