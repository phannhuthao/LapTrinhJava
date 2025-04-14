package Session23.bt4;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread("T1");
        Thread t2 = new MyThread("T2");
        Thread t3 = new MyThread("T3");

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
    }
}
