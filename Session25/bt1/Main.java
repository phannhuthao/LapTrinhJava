package Session25.bt1;

public class Main {
    public static void main(String[] args) {
        Account a1 = Account.getInstance("Hào", 1, 20);
        Account a2 = Account.getInstance("Hạ", 2, 20);

        a1.showInfo();
        a2.showInfo();

        System.out.println("a1 == a2 ? " + (a1 == a2));
    }
}
