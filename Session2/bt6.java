package Session2;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Nhập thông tin sinh viên--------");
        System.out.print("Nhập tên sinh viên: ");
        sc.nextLine();
        String ten = sc.nextLine(); 

        System.out.print("Nhập điểm Toán: ");
        double Toan = sc.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double Ly = sc.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double Hoa = sc.nextDouble();

        double DiemTrungBinh = (Toan + Ly + Hoa) / 3.0;

        String danhGia = (DiemTrungBinh >= 5.0) ? "Lên lớp" : "Học lại";

        System.out.println("\n------------Hiển thị thông tin sinh viên------------");
        System.out.println("Tên sinh viên: " + ten);
        System.out.printf("Điểm môn 1: %.2f | Điểm môn 2: %.2f | Điểm môn 3: %.2f\n", Toan, Ly, Hoa);
        System.out.printf("Điểm trung bình: %.2f\n", DiemTrungBinh);
        System.out.println("Đánh giá: " + danhGia);

        sc.close();
    }
}
