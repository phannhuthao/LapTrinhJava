package Session24.bt4;

public class Bicycle implements Vehicle.NonEngineVehicle {
    @Override
    public void sound(String message) {
        System.out.println("Chạy bằng sức người: " + message);
    }
}
