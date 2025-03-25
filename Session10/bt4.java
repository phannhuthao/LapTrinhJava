package Session10;

public class bt4 {
    class book {
        private String title;
        private String author;
        private int price;

        public String getterTitle() {
            return title;
        }

        public void setterTitle(String title) {
            this.title = title;
        }

        public String getterAuthor() {
            return author;
        }

        public void setterAuthor(String author) {
            this.author = author;
        }

        public int getterPrice() {
            return price;
        }

        public void setterPrice(int price) {
            if (price < 0) {
                System.out.println("Giá không được âm!");
            } else {
                this.price = price;
            }
        }
    }
}
