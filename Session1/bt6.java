package Session1;

public class bt6 {
    public static void main(String[] args) {

    }
}


//JDK, JRE và JVM có vai trò gì trong hệ sinh thái Java? Hãy phân biệt sự khác nhau giữa ba khái niệm này và nêu mối quan hệ giữa chúng

// -> JDK là bộ công cụ phát triển phần mềm Java. Nó bao gồm các công cụ cần thiết để viết, biên dịch và chạy chương trình Java
// -> JRE là môi trường chạy ứng dụng Java, bao gồm JVM và thư viện Java tiêu chuẩn. Nó không chứa trình biên dịch hay các công cụ phát triển khác
// -> JVM là một máy ảo trừu tượng, cho phép chạy bytecode Java trên bất kỳ hệ điều hành nào. Đây là thành phần chính giúp Java có tính chất "Viết một lần, chạy mọi nơi".

// Hãy giải thích khái niệm "Write once, run anywhere" trong Java. Cơ chế nào giúp Java có thể chạy trên nhiều nền tảng khác nhau mà không cần biên dịch lại?

// -> Thương hiệu của Java là "Write once, run anywhere" (Viết một lần, chạy bất cứ đâu). Có nghĩa là một chương trình Java có thể chạy trên các nền tảng khác nhau mà không phải dịch lại. Một số ngôn ngữ bậc cao khác không có được đặc tính này. Tính khả chuyển, hay khả năng chạy trên hầu như tất cả các nền tảng, còn là nguyên do cho việc Java rất phù hợp cho các ứng dụng Web.

// Quy trình để cài đặt và chạy chương trình Java đầu tiên bằng IntelliJ IDEA như thế nào? Hãy mô tả các bước cần thực hiện để tạo và chạy một dự án Java cơ bản.

// -> Bước 1: Cài đặt IntelliJ IDEA và JDK
// -> Bước 2: Tạo một dự án Java mới
// -> Bước 3: Viết chương trình Java đầu tiên
// -> Bước 4: Chạy chương trình


// Các phiên bản Java (Từ 1 -> 23)
//Java 8 (2014): Cải tiến lớn với Lambda Expressions, Stream API.
//Java 11 (2018): Phiên bản LTS (Long-Term Support), hỗ trợ lâu dài.
//Java 17 (2021): LTS tiếp theo, cải thiện hiệu suất và bảo mật.
//Java 21 (2023): LTS mới nhất với nhiều tính năng nâng cao.

// Phiên bản	                | Mục đích sử dụng	                                                                                              |     Đối tượng hướng đến
//Java SE (Standard Edition)	| Cung cấp nền tảng Java cơ bản (JVM, API, Collections, I/O, JDBC, Multithreading, Lambda)                        |	Ứng dụng Desktop, CLI, API cơ bản
//Java EE (Enterprise Edition)	| Mở rộng Java SE với các công nghệ cho ứng dụng web và doanh nghiệp (Servlets, JSP, EJB, JPA, REST, WebSockets)  |	Ứng dụng doanh nghiệp, Web, Cloud
//Java ME (Micro Edition)	    | Phiên bản Java rút gọn cho thiết bị di động, nhúng (IoT, Smart Cards)	                                          | Điện thoại cũ, thiết bị nhúng, IoT