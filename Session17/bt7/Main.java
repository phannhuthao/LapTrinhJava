package Session17.bt7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String input = sc.nextLine();

        String[] words = input.split("\\W+");

        List<String> wordList = new ArrayList<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }

        Collections.sort(wordList);


        // Đếm số lần xuất hiện của từ đầu tiên
        int count = 1;
        // kiểm tra  trùng lặp của các từ trong danh sách đã được sắp xếp
        for (int i = 1; i < wordList.size(); i++) {
            if (wordList.get(i).equals(wordList.get(i - 1))) {
                // Nếu từ hiện tại bằng từ trước đó, tăng số lần xuất hiện
                count++;
            } else {
                System.out.println(wordList.get(i - 1) + ": " + count);
                // Reset lại số lần xuất hiện cho từ mới
                count = 1;
            }
        }
        if (wordList.size() > 0) {
            System.out.println(wordList.get(wordList.size() - 1) + ": " + count);
        }
    }
}
