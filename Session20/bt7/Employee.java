package Session20.bt7;

public class Employee {
    public String name;
    public int age;
    public String department;
    public double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getterName() {
        return name;
    }

    public int getterAge() {
        return age;
    }

    public String getterDepartment() {
        return department;
    }

    public double getterSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("Tên: %s | Tuổi: %d | Phòng: %s | Lương: %.0f |",
                name, age, department, salary);
    }

}
