package Session22.bt7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Session22/bt7/data.txt");

        List<Country> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Xóa dấu ngoặc kép và tách bằng dấu phẩy
                line = line.replace("\"", ""); 
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0].trim());
                String code = parts[1].trim();
                String name = parts[2].trim();

                Country country = new Country(id, code, name);
                list.add(country);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }

        System.out.println("Danh sách Country:");
        for (Country country : list) {
            country.showInfo();
        }
    }
}
