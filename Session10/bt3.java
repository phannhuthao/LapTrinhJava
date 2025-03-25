package Session10;

import java.time.Year;

public class bt3 {
    class Car {
        private String model;
        private int year;
        private String make;

        public String getterMake() {
            return make;
        }

        public void setterMake(String make) {
            this.make = make;
        }

        public String getterModel() {
            return model;
        }

        public void setterModel(String model) {
            this.model = model;
        }


        public int getterYear() {
            return year;
        }
        public void setYear(int year) {
            // Lấy năm hiện tại
            int currentYear = Year.now().getValue();
            if (year > currentYear) {
                System.out.println("Năm sản xuất không hợp lệ!");
            } else {
                this.year = year;
            }
        }
    }


}
