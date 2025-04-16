package Session25.bt5;

public class SmsSubscriber implements Observer {
    private String phone;

    public SmsSubscriber(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String message) {
        System.out.println("Gửi SMS đến " + phone + ": " + message);
    }
}
