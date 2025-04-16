package Session25.bt2;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.getAnimal("dog");
        dog.speak();

        Animal cat = factory.getAnimal("cat");
        cat.speak();
    }
}
