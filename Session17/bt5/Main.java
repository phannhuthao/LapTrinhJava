package Session17.bt5;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();


        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);

        num2.add(4);
        num2.add(5);
        num2.add(6);
        num2.add(7);
        num2.add(8);

        HashSet<Integer> union= new HashSet<>(num1);
        // addAll:  thêm tất cả các phần tử của một tập hợp (hoặc một Collection) vào một tập hợp khác
        union.addAll(num2);

        TreeSet<Integer> sortSet = new TreeSet<>(union);

        System.out.println("Sau khi hợp 2 thành 1 (theo thứ tự tăng dần): " + sortSet);
    }
}
