package Session23.bt5;

public class Main {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread writer = new Thread(() -> {
            try {
                data.Writer("Ngũ Thế Hào");
                Thread.sleep(3000);
                System.out.print("...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> {
            try {
                Thread.sleep(1500);
                data.Reader();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        writer.start();
        reader.start();

    }
}
