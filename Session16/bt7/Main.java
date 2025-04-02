package Session16.bt7;

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

        // count1 đếm tổng số phần tử được duyệt
        int count1 = 0;
        // count3 đếm số phần tử xuất hiện đúng 1 lần
        int count3 = 0;

        System.out.println("Các phần tử bị trùng lặp và số lần xuất hiện:");
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            // kiểm tra trùng lặp
            boolean Duplicate = false;
            for (int k = 0; k < i; k++) {
                if (list.get(k) == num) {
                    Duplicate = true;
                    break;
                }
            }
            if (Duplicate) {
                continue;
            }

            // count2 đếm số lần xuất hiện của num
            int count2 = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == num) {
                    count2++;
                }
            }

            if (count2 > 1) {
                System.out.println(num + " xuất hiện " + count2 + " lần");
            }
            count1++;
        }

        System.out.println("\nCác phần tử xuất hiện đúng 1 lần:");
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int count2 = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == num) {
                    count2++;
                }
            }

            if (count2 == 1) {
                System.out.println(num);
                count3++;
            }
        }

        System.out.println("\nTổng số phần tử được duyệt: " + count1);
        System.out.println("Tổng số phần tử xuất hiện đúng 1 lần: " + count3);
    }
}
