package Session24.bt3;

public class Main {
    public static void main(String[] args) {
        Notification email = new Notifi.EmailNotification();
        Notifi.NotificationService emailService = new Notifi.NotificationService(email);
        emailService.notifyUser(" Đây là thông báo từ tin nhắn Email.");

        Notification sms = new Notifi.SMSNotification();
        Notifi.NotificationService smsService = new Notifi.NotificationService(sms);
        smsService.notifyUser(" Đây là thông báo từ tin nhắn SMS.");
    }
}
