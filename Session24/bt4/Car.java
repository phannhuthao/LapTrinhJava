package Session24.bt4;

public class Car implements Vehicle.EngineVehicle {
    @Override
    public void sound(String message) {
        System.out.println("Chạy bằng động cơ: " + message);
    }
}
