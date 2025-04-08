package Session19.bt6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("lambda");
        list.add("stream");
        list.add("functional");
        list.add("ddddd");

        List<String> resultList = new ArrayList<>();

        StringProcessor processor = input -> input.toUpperCase() + " - TECHNICAL";

        for (String str : list) {
            resultList.add(processor.processString(str));
        }

        processor.printList(resultList);
    }
}
