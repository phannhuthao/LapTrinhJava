package Session12.BT6;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(String name, int age, double basicSalary, int hoursWorked) {
        super(name, age, basicSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * hoursWorked;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Part-time Employee | Hours Worked: " + hoursWorked + " | Total Salary: " + calculateSalary());
    }
}
