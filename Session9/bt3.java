package Session9;

public class bt3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.display();

        Rectangle rect2 = new Rectangle(8.0, 5.5);
        rect2.display();
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // diện tích
    public double getArea() {
        return length * width;
    }
    // chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("|-------------------------------------|");
        System.out.println("|Chiều dài: " + length +             "|");
        System.out.println("|Chiều rộng: " + width +             "|");
        System.out.println("|Diện tích: " + getArea() +          "|");
        System.out.println("|Chu vi:    " + getPerimeter() +     "|");
        System.out.println("|-------------------------------------|");
    }
}
