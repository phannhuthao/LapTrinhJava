package Session17.bt6;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);

        num2.add(30);
        num2.add(40);
        num2.add(50);
        num2.add(60);

        HashSet<Integer> deliver= new HashSet<>(num1);
        // retainAll : giữ lại những phần tử có trong cả hai HashSet và loại bỏ những phần tử không xuất hiện trong cả hai tập hợp
        deliver.retainAll(num2);

        TreeSet<Integer> sortSet = new TreeSet<>(deliver);

        System.out.println("Sau khi giao: "+sortSet);
    }
}
