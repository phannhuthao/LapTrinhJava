package Session22.bt1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("src/Session22/bt1/output.txt");

        System.out.println("Tệp nằm ở đâu: "+ file.getAbsolutePath());

        try {
            System.out.print("Nhập một chuỗi văn bản bất kỳ vào: ");
            String str = sc.nextLine();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(str);
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Nội dung trong file: ");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi xử lý file: " + e.getMessage());
        }
    }
}
