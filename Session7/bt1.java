package Session7;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();


        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();


        System.out.print("Nhập chuỗi c: ");
        String c = sc.nextLine();

        String word = "";

        StringBuffer sb = new StringBuffer();
        sb.append(a).append(" ").append(b).append(" ").append(c);
        word = sb.toString().toUpperCase();

        System.out.println(word);

    }
}
