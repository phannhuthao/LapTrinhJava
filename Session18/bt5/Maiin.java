package Session18.bt5;

import java.util.HashMap;
import java.util.Map;

public class Maiin {
    public static void main(String[] args) {
        Map<String, Integer> map =  new HashMap<>();

        map.put("Cam", 500);
        map.put("Nhãn", 400);
        map.put("Chuối", 700);
        map.put("Mận", 900);
        map.put("Dâu", 350);

        // dùng stream tạo một luồng dữ liêu xử lí
        map.entrySet().stream()
                .filter(entry -> entry.getValue() >= 500 && entry.getValue() <= 1500)
                .sorted(Map.Entry.comparingByValue())
                // 	duyệt từng phần tử đã lọc và sắp xếp, rồi in ra đúng định dạng đề bà
                .forEach(entry -> System.out.println("Tên sản phẩm: " + entry.getKey() + " - Giá: " + entry.getValue()));
    }
}
