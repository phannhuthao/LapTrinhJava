package Session11.BT5;

class Circle implements Colorable {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Màu của tròn: " + color);
    }
}
