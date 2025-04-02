package Session16.bt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hào");
        list.add("Hạ");
        list.add("Diệp");
        list.add("Ly");
        list.add("Nhi");
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Danh sách kiểu vòng lặp for: " + list.get(i));
        }

        System.out.println("-----------------------------------------------");

        for (String s : list) {
            System.out.println("Danh sách kiểu vòng lặp for each: " + s);
        }

        System.out.println("-----------------------------------------------");

        while (it.hasNext()) {
            System.out.println("Danh sách kiểu iterator:" + it.next());
        }


    }
}
