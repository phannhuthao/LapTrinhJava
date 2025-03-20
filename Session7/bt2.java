package Session7;

public class bt2 {
    public static void main(String[] args){
        String word = "Hello, Java World!";
        System.out.println("Chuỗi ban đầu: " + word);

        StringBuilder sb = new StringBuilder(word);

        sb.replace(12, 17, "Universe");
        System.out.println("Sau khi chèn:" + sb);

        sb.delete(5, 9);
        System.out.println("Sau khi xóa từ kí tự 5 đến 9: "+ sb);
    }
}
