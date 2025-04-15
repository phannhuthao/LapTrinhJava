package Session24.bt1;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


    public class salaryCalculator {
        public double calculateSalary() {
            return salary * 1.1;
        }

    }

    public class ReportGenerator {
        public void Report(double calculatedSalary) {
            System.out.println("ID: " + id + " | " + "Tên: "  + name + " | " + "Lương: " + salary );
        }
    }
}
