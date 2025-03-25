package Session10;

public class testbt5 {
    public static void main(String[] args) {
        bt5 bt = new bt5();
        bt5.Circle myCircle = bt.new Circle();
        bt5.Cylinder myCylinder = bt.new Cylinder();

        myCircle.setRadius(2);
        System.out.println("Bán kính hình tròn: " + myCircle.getRadius());
        System.out.println("Diện tích hình tròn: " + myCircle.getArea());

        myCylinder.setRadius(6);
        myCylinder.setHeight(24);
        System.out.println("Bán kính hình trụ: " + myCylinder.getRadius());
        System.out.println("Chiều cao hình trụ: " + myCylinder.getHeight());
        System.out.println("Thể tích hình trụ: " + myCylinder.getVolume());
    }
}
