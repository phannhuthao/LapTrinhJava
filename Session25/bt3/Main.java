package Session25.bt3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarBuilder().setEngine("V8").setSeats(4).setColor("Blue").build();
        Car car2 = new CarBuilder().setEngine("E8").setSeats(8).setColor("Black").build();

        car1.showInfoCar();
        car2.showInfoCar();
    }
}
