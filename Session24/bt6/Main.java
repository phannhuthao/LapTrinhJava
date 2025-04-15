package Session24.bt6;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Phan Nhựt Hào");
        e1.addRole(new ManagerRole());
        e1.addRole(new SalesRole());

        Employee e2 = new Employee("Nguyễn Thanh Hạ");
        e2.addRole(new TechnicianRole());

        e1.performAllDuties();
        e2.performAllDuties();
    }
}
