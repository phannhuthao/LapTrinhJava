package Session23.bt6;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " đang chạy...");
            }
        }, "Thread 1 có ưu tiên thấp nhất (MIN_PRIORITY)");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " đang chạy...");
            }
        }, "Thread 2 có ưu tiên trung bình (NORM_PRIORITY)");

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " đang chạy...");
            }
        }, "Thread 3 có ưu tiên cao nhất (MAX_PRIORITY)");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        // Câu hỏi:  Liệu mức độ ưu tiên (priority) của các luồng có đảm bảo 100% thứ tự thực hiện giữa chúng không? Giải thích tại sao.

        // Trả lời:  Giải thích: Ưu tiên luồng có đảm bảo thứ tự thực hiện không?
        //Không! Độ ưu tiên (priority) chỉ là gợi ý cho trình quản lý luồng của JVM, không đảm bảo tuyệt đối rằng luồng có ưu tiên cao hơn sẽ luôn được chạy trước.
        //
        //🔎 Lý do:
        //
        //Việc lập lịch (scheduling) phụ thuộc vào JVM cụ thể và hệ điều hành đang sử dụng.
        //
        //Trên một số hệ thống, JVM có thể bỏ qua mức ưu tiên nếu thấy không cần thiết.
    }
}
