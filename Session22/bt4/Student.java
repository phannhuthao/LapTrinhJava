package Session22.bt4;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public int age;
    public double score;


    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    void showInfo() {
        System.out.println("Tên: " + name + "|" + "Tuổi: " + age + "|" + "Điểm: " + score);
    }
}
