package Session23.bt2;

public class Main {
    public static void main(String[] args) {
        Runnable printer = new NumberPrinter();
        Thread t1 = new Thread(printer);
        t1.start();
    }
}
