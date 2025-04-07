package Session18.bt7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> count = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N vào: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N phải là số dương. Nhập lại đi mày");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            // nếu phần tử đã có trong map tăng giá trị lên 1. Nếu chưa có thì thêm vào map với giá trị 1
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        System.out.print("Các phần tử trong mảng: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("Các phần tử theo số lần xuất hiện (tăng dần):");
        count.entrySet().stream().sorted((entry1,entry2) -> {
                    int compareCount = entry1.getValue() - entry2.getValue();
                    if (compareCount == 0) {
                        // Nếu số lần giống nhau, so sánh giá trị
                        return entry1.getKey() - entry2.getKey();
                    }
                    return compareCount;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần"));
    }
}
