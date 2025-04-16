package Session25.bt2;

public class AnimalFactory {
        public Animal getAnimal(String type) {
            if (type == null) {
                return null;
            }
            switch (type.toLowerCase()) {
                case "dog":
                    return new Animal.Dog();
                case "cat":
                    return new Animal.Cat();
                default:
                    throw new IllegalArgumentException("Không có loại động vật này: " + type);
            }
    }

}
