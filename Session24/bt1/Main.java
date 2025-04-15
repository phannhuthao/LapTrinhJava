package Session24.bt1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Phan Nhựt Hào", 8000000);


        Employee.salaryCalculator calculator = employee.new salaryCalculator();
        double salaryWithBonus = calculator.calculateSalary();

        Employee.ReportGenerator reporter = employee.new ReportGenerator();
        reporter.Report(salaryWithBonus);
    }
}
