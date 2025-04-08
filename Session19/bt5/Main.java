package Session19.bt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        System.out.println("Nhập chuỗi vào: ");
        String str = sc.nextLine();

        for (String s : str.split(",")) {
            list.add(s.trim());
        }

        Predicate<String> checkString5 = s -> s.startsWith("A") && s.length() >= 5;

        long count = list.stream().filter(checkString5).count();

        System.out.println("Số lượng chuỗi bắt đầu bằng 'A' và độ dài >= 5 là: " + count);
    }
}
