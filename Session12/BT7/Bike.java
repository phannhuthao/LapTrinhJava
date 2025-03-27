package Session12.BT7;

public class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Di chuyển chậm");
    }

    public void sound() {
        System.out.println("Ring Ring");
    }
}
