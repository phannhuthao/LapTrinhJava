package Session25.bt6;

public class FlatRateTax implements TaxCalculator {
    @Override
    public void calculateTax(double amount) {
        double tax = amount * 0.05;
        System.out.println("Thuế theo FlatRateTax (5%): " + tax);
    }
}
