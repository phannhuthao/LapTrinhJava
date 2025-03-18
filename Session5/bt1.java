package Session5;

public class bt1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int max = arr[0];
        System.out.println("Các phần tử trong mảng là: ");


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất trong mảng là: " + max);
    }
}
