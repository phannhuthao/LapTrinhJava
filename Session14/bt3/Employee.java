package Session14.bt3;

import java.util.Scanner;

import static Session14.bt3.EmployeeManagement.employeeList;

public class Employee implements IEmployee {

    public int id;
    public String name;
    public int year;
    public float rate;
    public float commission;
    public float salary;
    public boolean status;

    public int getterId() {
        return id;
    }

    public String getterName() {
        return name;
    }

    public int getterYear() {
        return year;
    }

    public float getterRate() {
        return rate;
    }

    public float getterCommission() {
        return commission;
    }

    public float getterSalary() {
        return salary;
    }

    public boolean getterStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public  void setSalary(float salary) {
        this.salary = salary;
    }

    public  void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập id: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập năm: ");
        this.year = scanner.nextInt();

        System.out.print("Nhập hệ số lương : ");
        this.rate = scanner.nextFloat();

        System.out.print("Nhập hoa hồng: ");
        this.commission = scanner.nextFloat();
        System.out.println("Trạng thái: " + (this.status ? "Đang làm việc" : "Nghỉ việc"));
        this.status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("ID    | Tên       | Năm                 |Số Lương  | Lương      | Hoa Hồng ");
        System.out.println("---------------------------------------------------------------------------------");
        for (Employee e : employeeList) {
            System.out.printf("%-8s | %-20s | %-20s | %-10.2f | %-10.2f | -6%.2f | -5%.2f",
                    e.getterId(), e.getterName(), e.getterYear(),
                    e.getterRate(), e.getterCommission());
        }
    }
}
