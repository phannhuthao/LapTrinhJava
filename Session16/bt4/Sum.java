package Session16.bt4;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = 0;

        for(Integer i : list) {
            sum = sum + i;
        }
        System.out.println("Tổng:" + sum);
//
//        for (int i = 0; i < list.size(); i++) {
//            sum = sum + list.get(i);
//        }
//        System.out.println("Tổng: "+ sum);
    }
}
