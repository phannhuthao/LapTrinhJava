package Session23.bt8;

public class Main {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        // Thread 1: Giữ lock1 và cố gắng lấy lock2
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Con chó đang giữ lock1 và sủa con mèo...");

                try {
                    // tạo cơ hội để thread2 chiếm lock2
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Con chó đã lấy được lock2 và đang đánh nhau với con mèo!");
                }
            }
        }, "Con chó sủa con mèo");

        // Thread 2: Giữ lock2 và cố gắng lấy lock1
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Con mèo đang giữ lock2 và khè con chó...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("Con mèo đã lấy được lock1 và đang đánh nhau với con chó!");
                }
            }
        }, "Con mèo khè con chó");

        t1.start();
        t2.start();
    }
}
