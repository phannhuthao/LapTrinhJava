package Session17.bt2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi vào: ");
        String str = sc.nextLine();


        if (list.contains(str)) {
            System.out.println("Chuỗi bạn vừa nhập " + str + " có trong list");
        } else {
            System.out.println("Chuỗi bạn vừa nhập " + str + " không có trong list");
        }

    }
}
