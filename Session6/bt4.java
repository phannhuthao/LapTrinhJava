package Session6;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String str = sc.nextLine();

        String replaceStr = str.replaceAll("[0-9]", "*");


        System.out.print("Chuỗi sau khi được thay thế là: "+ replaceStr);

    }
}
