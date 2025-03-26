package Session11.BT7;

    public class Main {
        public static void main(String[] args) {
            PartTimeEmployee partTimeEmp = new PartTimeEmployee("Hào", 15, 4);
            FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Hạ", 20);

            System.out.println(partTimeEmp.getName() + " Thu nhập: $" + partTimeEmp.calculateSalary() + " một ngày");
            System.out.println(fullTimeEmp.getName() + " Thu nhập: $" + fullTimeEmp.calculateSalary() + " một ngày");
        }
    }


