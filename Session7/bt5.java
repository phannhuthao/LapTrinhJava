package Session7;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String word = input.nextLine().trim();

        String[] words = word.split("\\s+");

        StringBuilder result = new StringBuilder(word);

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            result.append(sb.reverse()).append(" ");
        }

//        word.reverse();

        System.out.print("Chuỗi sau khi nối và đảo ngược: " + result.toString().trim());

    }
}
