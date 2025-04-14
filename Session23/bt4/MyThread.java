package Session23.bt4;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (name.equals("T1")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + name + " - Số: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Thread " + name + " bắt đầu...");
        }
    }
}
