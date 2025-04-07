package Session18.bt6;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Phan Nhựt Hào", 10);
        map.put("Nguyên Thanh Hạ", 10);
        map.put("Nguyễn Ngọc Diệp", 10);
        map.put("C", 4);
        map.put("D", 5);
        map.put("E", 6);
        map.put("F", 3);
        map.put("G", 8);
        map.put("Q", 9);
        map.put("O", 2);

        System.out.println("Danh sách học sinh và điểm số: " + map);

        int sum = 0;
        for (int point : map.values()) {
            sum += point;
        }
        double avgPoint = (double) sum / map.size();
        System.out.println("Điểm trung bình: " + avgPoint);

        //     if (map.entry.getValue() < 5) {
//        System.out.println("Danh sách (<5 xóa): " + map);
//        }

        map.entrySet().removeIf(entry -> entry.getValue() < 5);

        System.out.println("Danh sách (<5 đã xóa): " + map);
    }
}


