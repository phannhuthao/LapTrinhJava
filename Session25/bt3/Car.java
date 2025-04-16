package Session25.bt3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    public Car(String engine, int seats, String color) {
        this.engine = engine;
        this.seats = seats;
        this.color = color;
    }

    void showInfoCar() {
        System.out.println("Động cơ: " + engine + " Chỗ ngồi: " + seats + " Màu sắc: " + color);
    }

}
