package Session7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BT {
    public static void main(String[] args) {
        final int MAX = 10;
        String[] studentIdArray = new String[MAX];
        String[] studentNameArray = new String[MAX];
        String[] dateOfBirthArray = new String[MAX];
        boolean[] sexArray = new boolean[MAX];

        int size  = 0;
        studentIdArray[0] = "SV001";
        studentNameArray[0] = "John Doe ấbvdkvnlnfklvjsfvnskhvsb111";
        dateOfBirthArray[0] = "10/12/2004";
        sexArray[0] = true; // true: nam, false: nữ
        size++;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("+--------------Student Management--------------+");
            System.out.println("|1. Hiển thị danh sách                         |");
            System.out.println("|2. Thêm mới sinh viên                         |");
            System.out.println("|3. Cập nhật sinh viên                         |");
            System.out.println("|4. Xóa sinh viên                              |");
            System.out.println("|5. Tìm kiếm sinh viên                         |");
            System.out.println("|0. Thoát                                      |");
            System.out.println("+----------------------------------------------+");
            System.out.println("Nhập lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    displayStudentArray(studentIdArray,studentNameArray,dateOfBirthArray,sexArray,size);
                    break;
                case 2:
                    addStudent(studentIdArray, studentNameArray, dateOfBirthArray, sexArray, size, sc);
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 0 đến 5.");
            }
        }
    }
    // Hiển thị
    public static void displayStudentArray( String[] studentIdArray , String[] studentNameArray, String[] dateOfBirthArray,boolean[] sexArray,int size){
        if(size == 0){
            System.err.println("------------Danh sách trống-------------");
            return;
        }
        System.out.println("------------Danh sách sinh viên---------------");
        System.out.printf("+%s+%s+%s+%s+\n","-".repeat(7),"-".repeat(20),"-".repeat(12),"-".repeat(5));
        System.out.printf("|%-7s|%-20s|%-12s|%-5s|\n","ID","Tên sinh viên","Ngày sinh","Sex");
        System.out.printf("+%s+%s+%s+%s+\n","-".repeat(7),"-".repeat(20),"-".repeat(12),"-".repeat(5));
        for (int i = 0; i < size; i++) {
            System.out.printf("|%-7s|%-20s|%-12s|%-5s|\n",studentIdArray[i],formatString(studentNameArray[i],20), dateOfBirthArray[i], sexArray[i]?"Nam":"Nữ");
            System.out.printf("+%s+%s+%s+%s+\n","-".repeat(7),"-".repeat(20),"-".repeat(12),"-".repeat(5));
        }

    }
    private static String formatString(String str, int maxLength) {
        if (str.length() > maxLength){
            return str.substring(0,maxLength-3).concat("...");
        }
        return str;
    }

    // Thêm
    public static void addStudent(String[] studentIdArray, String[] studentNameArray, String[] dateOfBirthArray, boolean[] sexArray, int size, Scanner sc) {
        if (size == studentIdArray.length) {
            System.err.println("------------Mảng đầy ----------------");
            return;
        }

        // Nhập và kiểm tra ID
        while (true) {
            System.out.println("Nhập Id:");
            String id = sc.nextLine();
            if (validateStudentId(id, studentIdArray, size)) {
                studentIdArray[size] = id;
                break;
            }
        }

        // Nhập và kiểm tra Tên
        while (true) {
            System.out.println("Nhập tên sinh viên:");
            String name = sc.nextLine();
            if (validateStudentName(name)) {
                studentNameArray[size] = name;
                break;
            }
        }

        // Nhập và kiểm tra Ngày sinh
        while (true) {
            System.out.println("Nhập ngày sinh: ");
            String dob = sc.nextLine();
            if (validateDateOfBirth(dob)) {
                dateOfBirthArray[size] = dob;
                break;
            }
        }

     
    }

    private static boolean validateStudentId(String studentId, String[] studentIdArray ,int size){
        String regex = "^SV\\d{3}$";
        if(Pattern.matches(regex,studentId)){
            for (int i = 0; i < size; i++){
                if (studentIdArray[i].equals(studentId)){
                    System.err.println("Id đã tồn tại");
                    return false;
                }
            }
            return true;
        }else {
            System.err.println("Mã sinh viên ko đúng định dạng : ex : SV001");
            return false;
        }
    }

    private static boolean  validateStudentName(String studentName) {
        if (studentName.length() < 4 || studentName.length() > 50) {
            System.out.print("Tên phải có độ dài từ 4 đến 50 kí tự trở lên");
        }

        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.print("Tên không được để trống");
            return false;
        }
        return true;
    }

    private static boolean validateDateOfBirth(String dateOfBirth) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!Pattern.matches(regex, dateOfBirth)) {
            System.err.println("Ngày sinh không đúng định dạng (dd/MM/yyyy). Ví dụ: 01/01/2005");
            return false;
        }
        return true;
    }


}