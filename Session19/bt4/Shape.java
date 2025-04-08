package Session19.bt4;

public interface Shape {
    default double area() {
        return 0;
    }

    static void description() {
        System.out.print("This is a shape");
    }
}
