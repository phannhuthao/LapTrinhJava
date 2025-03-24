package Session9;

public class bt4 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.display();

        Circle circle2 = new Circle(5.5);
        circle2.display();
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 1.0;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void display() {
        System.out.println("|-------------------------------------|");
        System.out.println("| Bán kính: " + radius + "            |");
        System.out.println("| Diện tích: " + getArea() + "        |");
        System.out.println("| Chu vi: " + getCircumference() + "  |");
        System.out.println("|-------------------------------------|");
    }
}
