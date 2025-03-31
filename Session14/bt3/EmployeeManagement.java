package Session14.bt3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("******************** MENU *********************");
            System.out.println("|1. Nhập thông tin cho n nhân viên            |");
            System.out.println("|2. Hiển thị thông tin nhân viên              |");
            System.out.println("|3. Tính lương cho các nhân viên              |");
            System.out.println("|4. Tìm kiếm nhân viên theo tên nhân viên     |");
            System.out.println("|5. Cập nhật thông tin nhân viên              |");
            System.out.println("|6. Xóa nhân viên theo mã nhân viên           |");
            System.out.println("|7. Thoát                                     |");
            System.out.println("***********************************************");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addInfo();
                    break;
                case 2:
                    showInfo();
                    break;
                case 3:
                    calculateSalary();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    updateEmployee();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public static void addInfo() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Employee e = new Employee();
            e.inputData();
            employeeList.add(e);
        }
    }

    public static void showInfo() {
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách rỗng");
        }

        for (Employee e : employeeList) {
            e.displayData();
        }
    }

    public static void calculateSalary() {
        for (Employee e : employeeList) {
            e.salary = e.rate * 3000000 + e.commission;
            System.out.println("Lương của nhân viên " + e.name + ": " + e.salary);
        }
    }

    public static void searchEmployee() {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        for (Employee e : employeeList) {
            if (e.name.equalsIgnoreCase(name)) {
                e.displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    public static void updateEmployee() {
        System.out.print("Nhập ID nhân viên cần cập nhật: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employeeList) {
            if (e.id == id) {
                e.inputData();
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    public static void deleteEmployee() {
        System.out.print("Nhập ID nhân viên cần xóa: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employeeList) {
            if (e.id == id) {
                employeeList.remove(e);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }
}
