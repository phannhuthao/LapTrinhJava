package Session8;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************ MENU ************************************");
        System.out.println("|1. Nhập giá trị n phần tử của mảng                                          |");
        System.out.println("|2. In giá trị các phần tử trong mảng                                        |");
        System.out.println("|3. Tính trung bình các phần tử dương trong mảng                             |");
        System.out.println("|4. In ra vị trí các phần có giá trị bằng k trong mảng k (k nhập từ bàn phím)|");
        System.out.println("|5. Tính số lượng các phần từ là số nguyên tố trong mảng                     |");
        System.out.println("|6. Thoát chương trình                                                       |");
        System.out.println("************************************ ---- ************************************");

        int[] arr = null;
        int n = 0;

        int choice;
        do {
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số phần tử của mảng: ");
                    n = sc.nextInt();
                    arr = new int[n];
                    NhapGiaTri(arr, n, sc);
                    break;
                case 2:
                    InMang(arr, n);
                    break;
                case 3:
                    TrungBinhSoNguyenDuong(arr, n);
                    break;
                case 4:
                    InRaViTriNhapK(arr, n, sc);
                    break;
                case 5:
                    TinhSoLuongSoNguyen(arr, n);
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại");
            }
        } while (choice != 6);
        sc.close();
    }

    public static void NhapGiaTri(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void InMang(int[] arr, int n) {
        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void TrungBinhSoNguyenDuong(int[] arr, int n) {
        int sum = 0, count = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                }
            }
            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Trung bình các phần tử dương trong mảng: " + average);
            } else {
                System.out.println("Không có số dương trong mảng.");
            }
        }
    }

    public static void InRaViTriNhapK(int[] arr, int n, Scanner sc) {
        System.out.print("Nhập giá trị k: ");
        int k = sc.nextInt();
        boolean found = false;

        System.out.print("Vị trí các phần tử có giá trị bằng " + k + ": ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có phần tử nào có giá trị bằng:  " + k);
        } else {
            System.out.println();
        }
    }

    public static void TinhSoLuongSoNguyen(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (KiemTra(arr[i])) {
                count++;
            }
        }
        System.out.println("Số lượng phần tử là số nguyên tố trong mảng: " + count);
    }

    public static boolean KiemTra(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
