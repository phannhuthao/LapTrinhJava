package Session23.bt3;

public class SharedResource {
    public synchronized void printAlphabet() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
