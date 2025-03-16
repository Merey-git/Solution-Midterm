package payment;
public class PayPalPayment implements PaymentMethod {
    private String status;

    @Override
    public boolean processPayment(double amount) {
        System.out.println("PayPal payment processed: $" + amount);
        status = "Completed";
        return true;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
