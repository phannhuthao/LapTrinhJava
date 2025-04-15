package Session24.bt4;

public class Main {
    public static void main(String[] args) {
        Vehicle.EngineVehicle car = new Car();
        car.sound("Vroom vroom!");

        Vehicle.NonEngineVehicle bicycle = new Bicycle();
        bicycle.sound("Lạch cạch!");
    }
}
