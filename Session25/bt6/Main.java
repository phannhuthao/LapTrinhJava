package Session25.bt6;

public class Main {
    public static void main(String[] args) {
        TaxContext context;

        System.out.println("Áp dụng thuế FlatRateTax:");
        context = new TaxContext(new FlatRateTax());
        context.executeStrategy(1500);

        System.out.println("ProgressiveTax:");
        context.setTaxCalculator(new ProgressiveTax());
        context.executeStrategy(900);
        context.executeStrategy(2000);

        System.out.println("Áp dụng NoTax:");
        context.setTaxCalculator(new NoTax());
        context.executeStrategy(10000);
    }
}
