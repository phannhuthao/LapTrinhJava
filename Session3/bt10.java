package Session3;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Giải phương trình bậc 3: ax^3 + bx^2 + cx + d = 0");

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        System.out.print("Nhập d: ");
        double d = sc.nextDouble();


        if (a == 0) {
            System.out.println("Hệ số a = 0, phương trình trở thành phương trình bậc 2:");
            solveQuadraticEquation(b, c, d);
        } else {
            solveCubicEquation(a, b, c, d);
        }

        sc.close();
    }

    // Phương pháp giải phương trình bậc 2: bx^2 + cx + d = 0
    public static void solveQuadraticEquation(double b, double c, double d) {
        if (b == 0) {
            if (c == 0) {
                System.out.println(d == 0 ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: x = " + (-d / c));
            }
        } else {
            double delta = c * c - 4 * b * d;
            if (delta > 0) {
                double x1 = (-c + Math.sqrt(delta)) / (2 * b);
                double x2 = (-c - Math.sqrt(delta)) / (2 * b);
                System.out.println("Phương trình có hai nghiệm thực:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: x = " + (-c / (2 * b)));
            } else {
                System.out.println("Phương trình vô nghiệm thực");
            }
        }
    }

    // Phương pháp giải phương trình bậc 3 bằng công thức Cardano
    public static void solveCubicEquation(double a, double b, double c, double d) {
        // Đưa phương trình về dạng x^3 + px + q = 0 bằng cách đổi biến x -> x - b/3a
        double p = (3 * a * c - b * b) / (3 * a * a);
        double q = (2 * b * b * b - 9 * a * b * c + 27 * a * a * d) / (27 * a * a * a);
        double delta = q * q / 4 + p * p * p / 27;

        System.out.println("Phương trình có dạng thu gọn: x^3 + " + p + "x + " + q + " = 0");

        if (delta > 0) {
            // Một nghiệm thực, hai nghiệm phức
            double u = Math.cbrt(-q / 2 + Math.sqrt(delta));
            double v = Math.cbrt(-q / 2 - Math.sqrt(delta));
            double x1 = u + v;
            System.out.println("Phương trình có một nghiệm thực: x = " + x1);
        } else if (delta == 0) {
            // Một nghiệm bội
            double x1 = 2 * Math.cbrt(-q / 2);
            double x2 = -Math.cbrt(-q / 2);
            System.out.println("Phương trình có hai nghiệm thực:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            // Ba nghiệm thực
            double r = Math.sqrt(-p * p * p / 27);
            double phi = Math.acos(-q / (2 * r));
            double x1 = 2 * Math.cbrt(r) * Math.cos(phi / 3);

        }
    }
}