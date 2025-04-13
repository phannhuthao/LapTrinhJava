package Session22.bt2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên file vào kiểm tra: ");
        String fileName = sc.nextLine();

        File file = new File("src/Session22/bt2/" +fileName+".txt");

        if (file.exists()) {
            System.out.print("Tệp bạn vừa nhập đã tồn tại");
        } else if (file.createNewFile()) {
            System.out.print("Tệp đã được tạo thành công");
        }

    }
}
