package Session20.bt5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);

        System.out.println(normalList);
        System.out.println(singleElementList);
        System.out.println(allSameList);


        System.out.println("Loại bỏ phần tử trùng nhau: ");
        allSameList.stream().distinct().forEach(System.out::println);

        System.out.println("Bỏ qua phần tử lớn nhất: ");
        normalList.stream().skip(1).forEach(System.out::println);

        System.out.println("Sắp xếp danh sách theo thứ tự giảm dần");
        normalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        int max = normalList.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
//        System.out.println("Tìm số lớn thứ 2");
//        normalList.stream().filter(num -> num != max).max(Integer::compareTo).ifPresent(System.out::println);

        Optional<Integer> maxOpt = normalList.stream().max(Integer::compareTo);

        System.out.println("Tìm số lớn thứ 2:");

        // Nếu có số lớn nhất, tiếp tục tìm số lớn thứ hai
        if (maxOpt.isPresent()) {
            int max = maxOpt.get();

            // Lọc ra các số khác max rồi tìm max trong phần còn lại
            Optional<Integer> secondMax = normalList.stream()
                    .filter(num -> num != max)
                    .max(Integer::compareTo);

            secondMax.ifPresentOrElse(
                    val -> System.out.println("Số lớn thứ hai là: " + val),
                    () -> System.out.println("Không tìm thấy số lớn thứ hai")
            );
        } else {
            System.out.println("Danh sách rỗng");
        }
    }
}
