public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int CreditPaymentOneYear = service.calculate(12, 1_000_000, 9.99);
        System.out.println(CreditPaymentOneYear);

        int CreditPaymentTwoYears = service.calculate(24, 1_000_000, 9.99);
        System.out.println(CreditPaymentTwoYears);

        int CreditPaymentThreeYears = service.calculate(36, 1_000_000, 9.99);
        System.out.println(CreditPaymentThreeYears);
    }
}