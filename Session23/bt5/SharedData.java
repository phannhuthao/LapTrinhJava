package Session23.bt5;

public class SharedData {
    private String message;
    private boolean hasMessage = false;

    public synchronized void Writer(String sendMessage) {
        this.message = sendMessage;
        this.hasMessage = true;
        System.out.println("Người gửi đã gửi: " + sendMessage);
        notify();
    }

    public synchronized void Reader() {
        while (!hasMessage) {
            try {
                System.out.println("Đang chờ tin nhắn...");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tin nhắn đã đến người nhận: " + message);
    }
}
