package Session20.bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        System.out.println("Danh sách: " + number);
        number.stream().filter(n -> n % 2 != 0).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
