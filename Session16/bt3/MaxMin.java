package Session16.bt3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Iterator<Integer> it = list.iterator();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if  (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Giá trị lớn nhất: " +max);
        System.out.println("Giá trị nhỏ nhất: " +min);
    }
}
