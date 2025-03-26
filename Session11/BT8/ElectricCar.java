package Session11.BT8;

public class ElectricCar extends Car implements Refuelable {
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

     public String start() {
        System.out.println("Xe điện " + toString() + " đã khởi động không tiếng ồn");
         return null;
     }

    public String stop() {
        System.out.println("Xe điện " + toString() + " đã dừng và ngắt kết nối động cơ.");
        return null;
    }

    public String refuel() {
        System.out.println("Xe điện " + toString() + " đang sạc điện…");
        return null;
    }
}
