package Session22.bt6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("src/Session22/bt6/input.txt");
        File copy = new File("src/Session22/bt6/copy.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(input));
        bw.write("Phan Nhựt Hào");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(input));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();

        content.reverse();

        BufferedWriter bwCopy = new BufferedWriter(new FileWriter(copy));
        bwCopy.write(content.toString());
        bwCopy.close();

        BufferedReader brCopy = new BufferedReader(new FileReader(copy));
        System.out.println("Nội dung file copy.txt:");
        while ((line = brCopy.readLine()) != null) {
            System.out.println(line);
        }
        brCopy.close();
    }
}
