package Session10;

public class bt1 {

}


// 1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?
//Tính đóng gói (Encapsulation) là một trong bốn nguyên tắc cơ bản của lập trình hướng đối tượng (OOP - Object-Oriented Programming). Nó có nghĩa là ẩn giấu thông tin của đối tượng và chỉ cho phép truy cập thông qua các phương thức được chỉ định.
//
//💡 Lý do tính đóng gói quan trọng:
//
//Bảo vệ dữ liệu: Ngăn chặn dữ liệu bị thay đổi một cách không hợp lệ hoặc ngoài ý muốn.
//
//Kiểm soát quyền truy cập: Chỉ các phương thức cụ thể có thể truy cập hoặc thay đổi dữ liệu.
//
//Tăng tính bảo trì: Nếu cần thay đổi cách hoạt động bên trong của lớp, ta chỉ cần sửa đổi các phương thức mà không ảnh hưởng đến các phần khác của chương trình.
//
//Dễ dàng mở rộng và tái sử dụng: Giúp mã dễ quản lý và sử dụng lại trong các dự án khác.
//
//2. Làm thế nào để áp dụng tính đóng gói trong Java?
//Trong Java, tính đóng gói được áp dụng bằng cách:
//
//Khai báo các thuộc tính của lớp là private để không thể truy cập trực tiếp từ bên ngoài.
//
//Cung cấp phương thức getter để lấy giá trị và phương thức setter để thay đổi giá trị của thuộc tính đó.
//
//Sử dụng các mức độ truy cập (private, protected, public) để kiểm soát quyền truy cập.
//
//📌 Giải thích getter và setter:
//
//Getter (getX()): Trả về giá trị của một thuộc tính.
//
//Setter (setX(value)): Gán một giá trị mới cho thuộc tính (có thể kèm điều kiện kiểm tra).
//
//3. Ví dụ về tính đóng gói trong Java
//Dưới đây là một lớp Person với hai thuộc tính name và age được khai báo là private. Lớp này sử dụng các phương thức getter và setter để truy cập và thay đổi giá trị của chúng.

// 4. Lợi ích của việc sử dụng tính đóng gói trong việc bảo vệ dữ liệu và kiểm soát quyền truy cập
//✅ Bảo vệ dữ liệu:
//
//Dữ liệu bên trong lớp không thể bị thay đổi trực tiếp từ bên ngoài.
//
//Chỉ có thể thay đổi thông qua setter, giúp kiểm soát và đảm bảo tính hợp lệ.
//
//✅ Kiểm soát quyền truy cập:
//
//Chỉ cho phép đọc hoặc ghi dữ liệu theo quy tắc của lớp (getter và setter).
//
//Ngăn chặn truy cập trái phép hoặc không mong muốn.
//
//✅ Dễ bảo trì và mở rộng:
//
//Nếu cần thay đổi cách tính hoặc lưu trữ dữ liệu, ta chỉ cần sửa đổi getter và setter mà không ảnh hưởng đến mã khác.
//
//✅ Tăng tính linh hoạt:
//
//Có thể thực hiện kiểm tra điều kiện trước khi thay đổi dữ liệu, như kiểm tra tuổi hợp lệ trong setAge().