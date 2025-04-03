package Session17.bt3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("Danh sách ban đầu: " + numbers);

//        for (Integer i : numbers) {
//            if (i % 2 == 0) {
//                numbers.remove(i);
//            }
//        }
//        System.out.println("Danh sách sau khi xóa: " + numbers);
//    }


        numbers.removeIf( n -> n % 2 == 0);

        System.out.println("Danh sách sau khi xóa: " + numbers);
    }
}
