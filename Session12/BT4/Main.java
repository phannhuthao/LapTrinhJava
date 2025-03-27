package Session12.BT4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Diện tích mặc định của Shape: " + shape.area());
        System.out.println("Diện tích hình tròn: " + circle.area());
        System.out.println("Diện tích hình chữ nhật : " + rectangle.area());

        System.out.println("Diện tích hình tròn: " + shape.area(7));
        System.out.println("Diện tích hình chữ nhật: " + shape.area(3, 8));
    }
}
