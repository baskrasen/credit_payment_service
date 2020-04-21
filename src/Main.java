public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditPaymentOneYear = service.calculate(12, 1_000_000, 9.99);
        System.out.println(creditPaymentOneYear);

        int creditPaymentTwoYears = service.calculate(24, 1_000_000, 9.99);
        System.out.println(creditPaymentTwoYears);

        int creditPaymentThreeYears = service.calculate(36, 1_000_000, 9.99);
        System.out.println(creditPaymentThreeYears);
    }
}
