package Session20.bt4;

import java.time.LocalDate;

public class Person {
    public String name;
    LocalDate birthDate;


    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int age = now.getYear() - this.birthDate.getYear();
        return age;
    }

    public void printInfo() {
        System.out.println("Tên:  " + name + "| " + "Ngày Sinh: " + birthDate + "| " + "Tuổi:  " + getAge());
    }
}
