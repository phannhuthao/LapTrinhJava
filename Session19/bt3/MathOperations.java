package Session19.bt3;

public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return  a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("B không được là số 0");
            return 1;
        }
        return a / b;
    }
}
