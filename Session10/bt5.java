package Session10;

public class bt5 {
    double PI = 3.14;

    class Circle {
        private double radius;

        // Tính diện tích hình tròn
        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            if (radius < 0) {
                System.out.println("Bán kính không được âm!");
            } else {
                this.radius = radius;
            }
        }
    }

    class Cylinder extends Circle {
        private double height;

        // Tính thể tích hình trụ
        public double getVolume() {
            return PI * getRadius() * getRadius() * height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height < 0) {
                System.out.println("Chiều cao không được âm!");
            } else {
                this.height = height;
            }
        }
    }
}
