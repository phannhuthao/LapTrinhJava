package Session12.BT7;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        Bike myBike = new Bike();
//        Bus myBus = new Bus();
//
//        myBus.move();
//        myBus.sound();
//
//        myBike.move();
//        myBike.sound();
//
//        myCar.move();
//        myCar.sound();

        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Bus()
        };

        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
            System.out.println();
        }
    }
}
