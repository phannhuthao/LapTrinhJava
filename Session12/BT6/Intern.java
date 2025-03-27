package Session12.BT6;

public class Intern extends Employee {
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Intern | Total Salary: " + calculateSalary());
    }
}
