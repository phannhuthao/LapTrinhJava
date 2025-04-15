package Session24.bt5;

public class Clothing extends Product {
    public Clothing(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Quần áo - ID: " + getId() + ", Tên: " + getName());
    }
}
