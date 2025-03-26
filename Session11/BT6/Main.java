package Session11.BT6;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion();
        Elephant elephant = new Elephant();

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.makeAnimalsSoundAndMove();
    }
}
