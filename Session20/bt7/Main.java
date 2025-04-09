package Session20.bt7;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Quý", 26, "IT", 2500),
                new Employee("Lan", 24, "IT", 2100),
                new Employee("Minh", 30, "HR", 3000),
                new Employee("Huyền", 28, "IT", 2000),
                new Employee("Long", 32, "IT", 3100),
                new Employee("Trang", 25, "Marketing", 2200),
                new Employee("Việt", 27, "IT", 2500)
        );

        System.out.println("Danh sách nhân viên thỏa mãn điều kiện lọc:");

        List<Employee> filtered = employees.stream()
                .filter(e -> e.getterSalary() > 2000)
                .filter(e -> e.getterAge() >= 25)
                .filter(e -> e.getterDepartment().equalsIgnoreCase("IT"))
                .sorted((e1, e2) -> {
                    // so sánh lương giảm
                    if (Double.compare(e2.getterSalary(), e1.getterSalary()) != 0) {
                        return Double.compare(e2.getterSalary(), e1.getterSalary());
                    } else {
                        //  Nếu lương bằng nhau, so sánh tên theo thứ tự bảng chữ cái (tăng dần)
                        return e1.getterName().compareTo(e2.getterName());
                    }
                })
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}
