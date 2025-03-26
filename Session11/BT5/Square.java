package Session11.BT5;

public class Square {
    private double length, width;
    private String color;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Màu của hình vuông: " + color);
    }
}


