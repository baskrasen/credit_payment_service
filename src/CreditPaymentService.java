public class CreditPaymentService {
    public int calculate(int creditTearm, int amount, double percent) {
        double creditPayment = amount * (percent / 100 / 12 + (percent / 100 / 12) / (Math.pow(1 + percent / 100 / 12, creditTearm) - 1));
        return (int) creditPayment;
    }
}