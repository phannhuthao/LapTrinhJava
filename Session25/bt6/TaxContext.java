package Session25.bt6;

public class TaxContext {
    private TaxCalculator taxCalculator;

    public TaxContext(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void executeStrategy(double amount) {
        taxCalculator.calculateTax(amount);
    }
}
