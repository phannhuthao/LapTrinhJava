package Session22.bt3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("src/Session22/bt3/input.txt");
        File copy = new File("src/Session22/bt3/copy.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(input));
        bw.write("Phan Nhựt Hào");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bwCopy = new BufferedWriter(new FileWriter(copy));
        String line;
        while ((line = br.readLine()) != null) {
            bwCopy.write(line);
            bwCopy.newLine();
        }
        br.close();
        bwCopy.close();

        BufferedReader brCopy = new BufferedReader(new FileReader(copy));
        System.out.println("Nội dung file copy.txt:");
        while ((line = brCopy.readLine()) != null) {
            System.out.println(line);
        }
        brCopy.close();
    }
}
