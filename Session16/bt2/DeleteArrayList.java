package Session16.bt2;

import java.util.ArrayList;
import java.util.List;

public class DeleteArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Danh sách trước khi xóa: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 ) {
                System.out.println("Danh sách sau khi xóa (các số chia hết cho 3): " + list.get(i));
            }
        }
    }
}
