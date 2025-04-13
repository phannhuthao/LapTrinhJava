package Session22.bt4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Phan Nhựt Hào", 20, 9.6);

        File file = new File("src/Session22/bt4/student.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(student);
            System.out.println("Đã ghi vào file student.txt");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Student readStudent = (Student) ois.readObject();
            System.out.println("Đã đọc đối tượng từ file student.txt");
            System.out.println("Thông tin sinh viên: " + readStudent);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc đối tượng: " + e.getMessage());
        }
    }
}
