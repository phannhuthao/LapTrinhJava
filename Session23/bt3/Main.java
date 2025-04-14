package Session23.bt3;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(() -> {
            System.out.println("Luồng 1: ");
            sharedResource.printAlphabet();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Luồng 2: ");
            sharedResource.printAlphabet();
        });

        t1.start();
        t2.start();
    }
}
