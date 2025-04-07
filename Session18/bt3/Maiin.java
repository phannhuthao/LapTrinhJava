package Session18.bt3;

import java.util.LinkedHashMap;

public class Maiin {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Táo", 1);
        map.put("Nho", 2);
        map.put("Ổi", 3);
        map.put("Cam", 4);
        map.put("Chôm chôm", 5);

        System.out.println("Danh sách ban đầu: " + map);

        System.out.println("----------------------------------------------");

        map.remove("Chôm chôm");
        map.put("Táo",7);

        System.out.println("Danh sách sau khi xóa và cập nhật: " + map);
    }
}
