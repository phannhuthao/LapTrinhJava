package Session10;

public class testbt4 {
    public static void main(String[] args) {
        bt4 out = new bt4();
        bt4.book myBook = out.new book();

        myBook.setterTitle("Nguyền Hồn Sư");
        myBook.setterAuthor("Eyyo");
        myBook.setterPrice(500);

        System.out.println("Tên sách: " + myBook.getterTitle());
        System.out.println("Tên tác giả: " + myBook.getterAuthor());
        System.out.println("Giá: " + myBook.getterPrice());
    }
}
