package Session12.BT2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Tổng của a và b: " + calculator.add(2, 4));
        System.out.println("Tổng của a, b và c: " + calculator.add(4, 8, 15));
    }
}
