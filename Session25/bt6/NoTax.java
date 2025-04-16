package Session25.bt6;

public class NoTax implements TaxCalculator {
    @Override
    public void calculateTax(double amount) {
        System.out.println("Không áp dụng thuế: 0đ");
    }
}
