package Session16.bt5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(5);

        // / count1 dùng để đếm tổng số phần tử được duyệt
        int count1 = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            // count 2 đếm số lần xuất hiện của num
            int count2 = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == num) {
                    count2++;
                }
            }
            System.out.println(num + " xuất hiện " + count2 + " lần");
            count1++;
        }

        System.out.println("Tổng số phần tử được duyệt: " + count1);
    }
}
