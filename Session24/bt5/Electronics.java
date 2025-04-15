package Session24.bt5;

public class Electronics extends Product {
    public Electronics(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Đồng dùng điện tử - ID: " + getId() + ", Tên: " + getName());
    }
}
