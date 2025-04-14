package Session23.bt1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();

        thread1.setName("t1");
        thread2.setName("t2");

        thread1.start();
        thread2.start();
    }
}
