package Session9;

public class bt5 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        System.out.println("Vector 1: ");
        v1.displayVector();
        System.out.println("Độ dài Vector 1: " + v1.calculateMagnitude());

        System.out.println("\nVector 2: ");
        v2.displayVector();
        System.out.println("Độ dài Vector 2: " + v2.calculateMagnitude());

        Vector2D sum = v1.add(v2);
        System.out.println("\nTổng hai vector: ");
        sum.displayVector();

        Vector2D diff = v1.subtract(v2);
        System.out.println("\nHiệu hai vector: ");
        diff.displayVector();

        double dotProd = v1.dotProduct(v2);
        System.out.println("\nTích vô hướng của hai vector: " + dotProd);
    }

    static class Vector2D {
        double x, y;

        Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Vector2D() {
            this.x = 0;
            this.y = 0;
        }
        //  tính độ dài vector
        public double calculateMagnitude() {
            return Math.sqrt(x * x + y * y);
        }

        // cộng
        public Vector2D add(Vector2D v) {
            return new Vector2D(this.x + v.x, this.y + v.y);
        }
        // trừ
        public Vector2D subtract(Vector2D v) {
            return new Vector2D(this.x - v.x, this.y - v.y);
        }
        // nhân
        public double dotProduct(Vector2D v) {
            return this.x * v.x + this.y * v.y;
        }

        public void displayVector() {
            System.out.println("(" + x + ", " + y + ")");
        }
    }
}
