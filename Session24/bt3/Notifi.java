package Session24.bt3;

public class Notifi {

    public static class EmailNotification implements Notification {

        @Override
        public String send(String message) {
            return "Emali đã gửi cho bạn " + message;
        }
    }

    public static class SMSNotification implements Notification {
        @Override
        public String send(String message) {
            return "SMS đã gửi cho bạn " + message;
        }
    }

    public static class NotificationService {
        private Notification notification;

        public NotificationService(Notification notification) {
            this.notification = notification;
        }

        public void notifyUser(String message) {
            String result = notification.send(message);
            System.out.println(result);
        }
    }
}
