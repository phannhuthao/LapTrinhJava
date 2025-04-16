package Session25.bt6;

public class ProgressiveTax implements TaxCalculator {
    @Override
    public void calculateTax(double amount) {
        double tax;
        if (amount < 1000) {
            tax = amount * 0.05;
        } else {
            tax = amount * 0.10;
        }
        System.out.println("Thuế theo ProgressiveTax: " + tax);
    }
}
