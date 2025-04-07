package Session18.bt4;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("NV1", 5000);
        map.put("NV2", 10000);
        map.put("NV3", 3000);
        map.put("NV4", 9000);
        map.put("NV5", 7000);

        System.out.println("Danh sách ban đầu: " + map);

        System.out.println("-------------------------");

        map.put("NV3", 9000);
        map.remove("NV1");

        System.out.println("Danh sách sau khi cập nhật và xóa: " + map);


    }
}
