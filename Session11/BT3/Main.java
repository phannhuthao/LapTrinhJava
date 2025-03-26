package Session11.BT3;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);
        Bike myBike = new Bike("Yamaha", 80);

        myCar.start();
        myCar.displayInfo();

        myBike.start();
        myBike.displayInfo();
    }
}
