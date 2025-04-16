package Session25.bt5;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        Observer email1 = new EmailSubscriber("haophannhut@gmail.com");
        Observer email2 = new EmailSubscriber("hanguyenthanh@gmail.com");
        Observer sms1 = new SmsSubscriber("0862536828");

        notificationSystem.registerObserver(email1);
        notificationSystem.registerObserver(email2);
        notificationSystem.registerObserver(sms1);

        System.out.println("Gửi thông báo lần 1: ");
        notificationSystem.notifyObservers("Khuyến mãi 50% tất cả sản phẩm ở shoppe");

        System.out.println("Gỡ hanguyenthanh@gmail.com khỏi danh sách nhận:");
        notificationSystem.removeObserver(email2);

        System.out.println("Gửi thông báo lần 2:");
        notificationSystem.notifyObservers("Chỉ còn 2 ngày cuối cùng của chương trình này");
    }
}
