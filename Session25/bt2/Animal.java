package Session25.bt2;

public interface Animal {
    abstract void speak();

    class Dog implements Animal {

        @Override
        public void speak() {
            System.out.println("Chó kêu: ẳng ẳng ẳng");
        }
    }

    class Cat implements Animal {

        @Override
        public void speak() {
            System.out.println("Mèo kêu: Mèo méo meo mèo mèo. Con mèo ngốc nghếch cute phô mai que");
        }
    }
}
