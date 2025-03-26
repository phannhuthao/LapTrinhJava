package Session11.BT8;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars;

    public Garage() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println(car.toString() + " đã được thêm vào gara.");
    }

    public void startAllCars() {
        for (Car car : cars) {
            car.start();
        }
    }

    public void stopAllCars() {
        for (Car car : cars) {
            car.stop();
        }
    }

    public void refuelAllCars() {
        for (Car car : cars) {
            if (car instanceof Refuelable) {
                ((Refuelable) car).refuel();
            }
        }
    }
}
