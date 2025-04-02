package Session16.bt6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(45);
        list.add(5);

        // count1 đếm số lần duyệt
        int count1 = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            // count2 để kiểm tra số lần xuất hiện
            int count2 = 0;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == num) {
                    // xóa phần tử trùng
                    list.remove(j);
                    // kiểm tra lại lần nữa để ko bị bỏ sót
                    j--;
                }
            }
            count1++;
        }

        System.out.println("Danh sách sau khi xóa trùng: " + list);
        System.out.println("Tổng số phần tử đã duyệt: " + count1);
    }
}
