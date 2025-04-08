package Session19.bt2;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập f(x) vào: ");
        int n = sc.nextInt();

        Function<Integer, Integer> calculateQuadratic = x -> x * x + 3 * x + 2;

        System.out.println("f(" + n + ") = " + calculateQuadratic.apply(n));

        System.out.print("Kết quả của phương trình bậc 2 là: " + calculateQuadratic.apply(n));
    }
}
