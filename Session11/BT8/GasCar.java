package Session11.BT8;

public class GasCar extends Car implements Refuelable {
    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        System.out.println("Xe chạy xăng " + toString() + " đã khởi động với tiếng động cơ.");

        return null;
    }

    @Override
    public String stop() {
        System.out.println("Xe chạy xăng " + toString() + " đã dừng và động cơ tắt.");
        return null;
    }

    @Override
    public String refuel() {
        System.out.println("Xe chạy xăng " + toString() + " đang được đổ xăng...");
        return null;
    }
}
