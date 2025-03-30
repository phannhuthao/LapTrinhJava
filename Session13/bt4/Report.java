package Session13.bt4;

public class Report {
    public static void main(String[] args) {
        double[] scores = {9.2, 8.3, 8.8};
        generateReport("Phan Nhựt Hào", 20, scores);
    }

    public static void generateReport(String name, int age, double[] scores) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        double average = calculateAverage(scores);
        System.out.println("Average Score: " + average);
        printEvaluatePerformance(average);
    }

    public static double calculateAverage(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }

    public static void printEvaluatePerformance(double avg) {
        if (avg >= 8) {
            System.out.println("Grade: Excellent");
        } else if (avg >= 5) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
