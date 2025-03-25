package Session10;

public class bt2 {
}

// 1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
//Khái niệm kế thừa (Inheritance)
//Kế thừa (Inheritance) là một trong bốn nguyên tắc quan trọng của lập trình hướng đối tượng (OOP - Object-Oriented Programming). Nó cho phép một lớp (lớp con) tái sử dụng các thuộc tính và phương thức của một lớp khác (lớp cha) mà không cần phải viết lại mã.
//
//Trong Java, kế thừa được thực hiện bằng từ khóa extends.
//
//Lợi ích của kế thừa
//✔ Tái sử dụng mã: Giúp tránh việc viết lại mã, tiết kiệm thời gian và công sức.
//✔ Dễ bảo trì: Khi cần cập nhật, chỉ cần sửa đổi trong lớp cha thay vì sửa trong từng lớp con.
//✔ Tăng tính mở rộng: Giúp xây dựng các hệ thống linh hoạt, có thể mở rộng dễ dàng.
//✔ Tạo mối quan hệ giữa các lớp: Giúp biểu diễn các quan hệ thực tế như "is-a" (là một).
//
//Ví dụ:
//
//Ô tô là một phương tiện giao thông → Car kế thừa từ Vehicle.
//
//Chó là một động vật → Dog kế thừa từ Animal.

// 2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation) trong Java
//Đặc điểm	Kế thừa (Inheritance)	Đóng gói (Encapsulation)
//Mục đích	Tái sử dụng mã nguồn và mở rộng tính năng.	Bảo vệ dữ liệu, kiểm soát truy cập.
//Cách thực hiện	Lớp con kế thừa từ lớp cha bằng từ khóa extends.	Sử dụng private để ẩn dữ liệu, truy cập qua getter và setter.
//Tính chất	Thiết lập quan hệ "is-a" giữa các lớp.	Đảm bảo tính bảo mật của dữ liệu nội bộ.
//Mức độ bảo vệ	Có thể sử dụng public, protected để kiểm soát truy cập.	Giới hạn quyền truy cập dữ liệu từ bên ngoài.

// 3. Ví dụ về kế thừa trong Java

// package Session9;
//
/// / Lớp cha (Superclass)
//class Animal {
//    String name;
//
//    // Constructor
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    // Phương thức hiển thị thông tin
//    public void makeSound() {
//        System.out.println(name + " tạo ra âm thanh.");
//    }
//}
//
//// Lớp con (Subclass) kế thừa từ lớp cha Animal
//class Dog extends Animal {
//
//    // Constructor
//    public Dog(String name) {
//        super(name);  // Gọi constructor của lớp cha
//    }
//
//    // Ghi đè phương thức makeSound
//    @Override
//    public void makeSound() {
//        System.out.println(name + " sủa gâu gâu!");
//    }
//}
//
//// Lớp chính (Main)
//public class Main {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal("Động vật");
//        myAnimal.makeSound();
//
//        Dog myDog = new Dog("Cún con");
//        myDog.makeSound();
//    }
//}

// 4. Lợi ích và hạn chế của kế thừa trong Java
//✅ Lợi ích của kế thừa
//Tái sử dụng mã: Lớp con có thể sử dụng lại các phương thức và thuộc tính của lớp cha mà không cần viết lại.
//
//Giảm thiểu mã trùng lặp: Giúp mã gọn gàng hơn, tránh lặp đi lặp lại cùng một logic.
//
//Dễ dàng bảo trì: Khi cần sửa đổi, chỉ cần thay đổi ở lớp cha thay vì nhiều lớp con.
//
//Dễ mở rộng: Dễ dàng thêm tính năng mới bằng cách mở rộng lớp cha mà không làm ảnh hưởng đến mã gốc.
//
//⚠ Hạn chế của kế thừa
//Thiếu linh hoạt: Khi lớp con kế thừa từ lớp cha, nó bị ràng buộc với cấu trúc của lớp cha.
//
//Gây phụ thuộc chặt chẽ (Tight Coupling): Nếu lớp cha thay đổi, lớp con cũng bị ảnh hưởng, có thể gây lỗi.
//
//Không thể kế thừa nhiều lớp (Java không hỗ trợ đa kế thừa): Một lớp chỉ có thể kế thừa từ một lớp cha, điều này đôi khi làm hạn chế khả năng mở rộng.
//
//Tăng độ phức tạp: Nếu hệ thống có nhiều tầng kế thừa, việc bảo trì và theo dõi sẽ khó khăn hơn.