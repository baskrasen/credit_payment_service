public class CreditPaymentService {
    public int calculate( int CreditTearm, int amount, double percent) {
        double CreditPayment = amount * (percent/100/12 + (percent / 100 / 12) / (Math.pow (1 + percent / 100 / 12, CreditTearm) - 1));
        return (int) CreditPayment; }
}