package Session24.bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double amount = 1000000;


        List<TaxCalculator> taxList = new ArrayList<>();
        taxList.add(new Tax.IncomeTax());
        taxList.add(new Tax.EnvironmentalTax());

        double totalTax = 0;
        for (TaxCalculator tax : taxList) {
            double taxAmount = tax.calculateTax(amount);
            totalTax += taxAmount;
            System.out.println("Thuế tính được: " + taxAmount);
        }

        System.out.println("Tổng thuế phải trả: " + totalTax);
    }

}
