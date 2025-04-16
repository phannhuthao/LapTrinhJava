package Session25.bt1;

public class Account  {
    private static Account instance;

    private String name;
    private int id;
    private int age;

    public Account(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public static Account getInstance(String name, int id, int age) {
        if (instance == null) {
            instance = new Account(name, id, age);
        }
        return instance;
    }

    public void showInfo() {
        System.out.println("Tên: " + name + ", ID: " + id + ", Tuổi: " + age);
    }
}
