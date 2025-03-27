package Session12.BT6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new PartTimeEmployee("Phan Nhựt Hào", 20, 100, 4000),
                new FullTimeEmployee("Nguyễn Thanh Hạ", 20, 5000, 1000),
                new Intern("Nguyễn Ngọc Diệp", 20, 2000)
        };

        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("---------------------------");
        }
    }
}
