package Session18.bt2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Xe đạp", 1500000);
        map.put("Ly nước", 30000);
        map.put("Nước sting", 1000);
        map.put("Kẹo", 3000);
        map.put("Laptop1", 12000000);


            if (map.containsKey("Laptop")) {
                System.out.println("Có sản phẩm có tên Laptop");
            } else {
                System.out.println("Không có tên sản phẩm");
            }



            if (map.containsValue(1000)) {
                System.out.println("Có gíá trị 1000");
            } else {
                System.out.println("Không có giá trị đó");
            }




    }
}
