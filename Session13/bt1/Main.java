package Session13.bt1;

public class Main {
    public static void main(String[] args) {
        int numberOne = 5;
        int numberTwo = 10;
        int result = calculateExpression(numberOne, numberTwo);
        System.out.println("Result: " + result);
    }

    public static int calculateExpression(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber + (firstNumber + secondNumber);
    }
}
