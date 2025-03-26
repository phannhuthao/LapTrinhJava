package Session11.BT7;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * paymentPerHour;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
