package Session10;

public class testbt3 {
    public static void main(String[] args) {
        bt3 outer = new bt3();
        bt3.Car myCar = outer.new Car();

        myCar.setterMake("Toyota");
        myCar.setterModel("Corolla");
        myCar.setYear(2025);

        System.out.println("Thương hiệu: " + myCar.getterMake());
        System.out.println("Mẫu xe: " + myCar.getterModel());
        System.out.println("Năm sản xuất: " + myCar.getterYear());

        myCar.setYear(2022);
        System.out.println("Năm sản xuất sau khi cập nhật: " + myCar.getterYear());
    }
}
