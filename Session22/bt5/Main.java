package Session22.bt5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Session22/bt5/input.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Văn Lâm\n");
        bw.write("Tiến Linh\n");
        bw.write("Xuân Son\n");
        bw.write("Hoàng Đức\n");
        bw.write("Văn Hậu\n");
        bw.close();

        String longestName = "";
        int maxLength = 0;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.length() > maxLength) {
                maxLength = line.length();
                longestName = line;
            }
        }
        br.close();

        System.out.println("Tên cầu thủ dài nhất: " + longestName);
        System.out.println("Độ dài là: " + maxLength);
    }
}
