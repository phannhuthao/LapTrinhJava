package Session7;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String word = input.nextLine();

        System.out.println("Chuỗi ban đầu: " + word);

        word = word.toLowerCase();

        StringBuilder sb = new StringBuilder(word);

        sb.reverse();
        System.out.println("Chuỗi sau khi đảo ngược: " + sb);

        if (word.equals(sb.toString())) {
            System.out.print("Chuỗi đối xứng");
        } else {
            System.out.print("Chuỗi không đối xứng đối xứng");
        }
    }
}
