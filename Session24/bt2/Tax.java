package Session24.bt2;

public class Tax {
    public static class IncomeTax implements TaxCalculator {

        @Override
        public double calculateTax(double amount) {
            return amount * 0.10;
        }
    }

    public static class EnvironmentalTax implements TaxCalculator {

        @Override
        public double calculateTax(double amount) {
            return amount * 0.05;
        }
    }
}
