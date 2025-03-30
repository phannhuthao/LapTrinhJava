package Session13.bt2;

public class Student {
    public static void main(String[] args) {
        double[] point = {7.5, 8.0, 6.5};
        double avgPoint = calculateAvg(point);

        if (avgPoint >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }


    public static double calculateAvg(double[] points) {
        double totalPonit = 0;

        for (double point : points) {
            totalPonit += point;
        }
        return totalPonit / points.length;
    }
}
