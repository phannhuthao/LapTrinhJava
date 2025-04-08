package Session19.bt3;


import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a vào: ");
        int a = sc.nextInt();

        System.out.print("Nhập b vào: ");
        int b = sc.nextInt();

        BiFunction<Integer, Integer, Integer> sum = MathOperations::add;
        System.out.println("Tổng: " + sum.apply(a,b));

        BiFunction<Integer, Integer, Integer> minus = MathOperations::subtract;
        System.out.println("Hiệu: " + minus.apply(a,b));

        BiFunction<Integer, Integer, Integer> accumulation = MathOperations::multiply;
        System.out.println("Nhân: " + accumulation.apply(a,b));

        BiFunction<Integer, Integer, Integer> divisor = MathOperations::divide;
        System.out.println("Chia: " + divisor.apply(a,b));


    }
}
