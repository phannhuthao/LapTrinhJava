package Session11.BT6;

public class Elephant extends Animal {
    @Override
    public void sound() {
        System.out.println("Âm thanh của voi: Trumpet!");
    }

    @Override
    public void move() {
        System.out.println("Hành động di chuyển của voi: The elephant is walking");
    }
}