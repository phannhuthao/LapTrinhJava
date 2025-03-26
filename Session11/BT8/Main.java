package Session11.BT8;

public class Main {
    public static void main(String[] args) {
        Car tesla = new ElectricCar("Tesla Model 3", 2023, 50000);
        Car toyota = new GasCar("Toyota Camry", 2022, 35000);

        Garage garage = new Garage();
        garage.addCar(tesla);
        garage.addCar(toyota);

        System.out.println("--- Khởi động xe ---");
        garage.startAllCars();

        System.out.println("--- Dừng xe ---");
        garage.stopAllCars();

        System.out.println("--- Nạp nhiên liệu ---");
        garage.refuelAllCars();
    }
}
