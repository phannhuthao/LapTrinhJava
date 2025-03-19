package Session6;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStr = 0;

        System.out.print("Nhập một chuỗi: ");
        String str = sc.nextLine();
        String[] arr = str.trim().split("\\s+");

        System.out.println("Chuỗi vừa được nhập là: "+ str);

        totalStr = arr.length;
        System.out.print("Số từ trong chuỗi là: " + totalStr);
    }
}
