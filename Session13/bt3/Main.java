package Session13.bt3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Phép Cộng : " + calculator.add(10, 2));
        System.out.println("Phép Nhân : " + calculator.multiply(25, 5));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
