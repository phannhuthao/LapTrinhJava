package Session10;

public class testbt7 {
    public static void main(String[] args) {
        bt7S bt = new bt7S();

        bt7S.Student[] students = {
                bt.new Student("Phan Nhựt Hào", "SV1", 3.5),
                bt.new GraduateStudent("Nguyễn Thanh Hạ", "SV2", 3.8, "Kế Hoạch Phát Triển Kinh Doanh", "GS. Nguyễn Ngọc Diệp"),

        };

        System.out.println("Danh sách các sinh viên:");
        for (bt7S.Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}
