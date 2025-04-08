package Session19.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hào");
        list.add("");
        list.add("aaaaa");
        list.add("");
        list.add("hmmmm");

        Predicate<String> checkString = String :: isBlank;

        list.removeIf(String::isEmpty);

        System.out.println(list);
    }
}
