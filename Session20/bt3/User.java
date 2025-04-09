package Session20.bt3;

import java.util.Optional;

public class User {
    public String name;
    Optional<String> phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }


    public void printInfo() {
        String phone = this.phoneNumber.orElse("Không có");
        System.out.print("Tên: "+ name + "SĐT: " + phone);
    }


}
