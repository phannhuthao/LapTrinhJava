package Session20.bt6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> frequencyMap = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Thời điểm xử lý: " + dtf.format(now));

        System.out.println("\n{");
        frequencyMap.forEach((key, value) -> {
            System.out.println("   \"" + key + "\": " + value + ",");
        });
        System.out.println("}");
    }
}
