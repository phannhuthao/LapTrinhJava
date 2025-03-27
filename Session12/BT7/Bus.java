package Session12.BT7;

public class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Di chuyển tốc độ trung bình");
    }

    @Override
    public void sound() {
        System.out.println("Honk Honk");
    }
}
